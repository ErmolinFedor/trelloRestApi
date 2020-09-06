package trello.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import trello.beans.Board;
import trello.enums.TrelloBoardConstant;

import java.net.URI;
import java.util.HashMap;
import java.util.Random;
import java.util.ResourceBundle;

import static io.restassured.http.ContentType.*;
import static java.util.Locale.ENGLISH;

public class TrelloBoardServiceObj {

    public static URI trelloUri;
    private static ResourceBundle resourceBundle;
    private HashMap<String, String> params = new HashMap<>();

    static {
        resourceBundle = ResourceBundle.getBundle("api", ENGLISH);
        trelloUri = URI.create(resourceBundle.getString("path"));
    }

    private TrelloBoardServiceObj() {
    }

    public static class BoardApiBuilder {

        private TrelloBoardServiceObj trelloBoardServiceObj;

        private BoardApiBuilder(TrelloBoardServiceObj trelloBoardServiceObj) {
            this.trelloBoardServiceObj = trelloBoardServiceObj;
        }

        public BoardApiBuilder setDescription(String description) {
            trelloBoardServiceObj.params.put(
                    TrelloBoardConstant.DESCRIPTION.getConstantName(),
                    description);
            return this;
        }

        public BoardApiBuilder setClosed(Boolean isClosed) {
            trelloBoardServiceObj.params.put(
                    TrelloBoardConstant.CLOSED.getConstantName(),
                    isClosed.toString());
            return this;
        }

        public Board createBoard() {
            return formBoardFromResponse(
                    RestAssured
                            .given()
                            .spec(requestConfiguration())
                            .params(trelloBoardServiceObj.params)
                            .log().all()
                            .post(resourceBundle.getString("path")
                                    + resourceBundle.getString("boards")
                            ).prettyPeek()
            );
        }

        public int deleteBoard(String id) {
            return RestAssured
                    .given()
                    .spec(requestConfiguration())
                    .log().all()
                    .delete(resourceBundle.getString("path")
                            + resourceBundle.getString("boards")
                            + id
                    ).prettyPeek()
                    .then()
                    .extract()
                    .statusCode();
        }

        public Board updateBoard(String id) {
            return formBoardFromResponse(
                    RestAssured
                            .given()
                            .spec(requestConfiguration())
                            .params(trelloBoardServiceObj.params)
                            .log().all()
                            .put(resourceBundle.getString("path")
                                    + resourceBundle.getString("boards")
                                    + id
                            ).prettyPeek()
            );
        }

    }

    public static BoardApiBuilder boardApiBuilder() {
        return new BoardApiBuilder(new TrelloBoardServiceObj());
    }

    public static Board createBoard() {
        TrelloBoardServiceObj api = new TrelloBoardServiceObj();
        api.params.put(TrelloBoardConstant.NAME.getConstantName(),
                "Board " + new Random().nextInt(1000));
        return new BoardApiBuilder(api).createBoard();
    }

    public static int deleteBoard(final String id) {
        TrelloBoardServiceObj api = new TrelloBoardServiceObj();
        return new BoardApiBuilder(api).deleteBoard(id);
    }

    private static Board formBoardFromResponse(Response response) {
        if (HttpStatus.SC_OK == response.then().extract().statusCode()) {
            return new Gson().
                    fromJson(response.asString().trim(),
                            new TypeToken<Board>() {}.getType());
        } else {
            return null;
        }
    }

    private static RequestSpecification requestConfiguration() {
        return new RequestSpecBuilder()
                .setRelaxedHTTPSValidation()
                .setBaseUri(trelloUri)
                .addParam("key", resourceBundle.getString("key"))
                .addParam("token", resourceBundle.getString("token"))
                .build().contentType(URLENC.withCharset("utf-8"));
    }
}
