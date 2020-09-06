package trello;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import trello.beans.Board;
import trello.service.TrelloBoardServiceObj;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class RestTests {
    @Test
    public void createNewBoardsTest() {
        Board board1 = TrelloBoardServiceObj.createBoard();
        Board board2 = TrelloBoardServiceObj.createBoard();

        assertThat(board1.getClosed(), equalTo(false));
        assertThat(board2.getClosed(), equalTo(false));

        TrelloBoardServiceObj.deleteBoard(board1.getId());
        TrelloBoardServiceObj.deleteBoard(board2.getId());
    }

    @Test
    public void closeBoardTest() {
        Board board1 = TrelloBoardServiceObj.createBoard();
        board1 = TrelloBoardServiceObj.boardApiBuilder()
                .setClosed(true)
                .updateBoard(board1.getId());

        assertThat(true, equalTo(true));
        assertThat(board1.getClosed(), equalTo(true));
    }

    @Test
    public void deleteBoardTest() {
        Board board1 = TrelloBoardServiceObj.createBoard();

        board1 = TrelloBoardServiceObj.boardApiBuilder()
                .setClosed(true)
                .updateBoard(board1.getId());

        assertThat(TrelloBoardServiceObj.deleteBoard(board1.getId()), equalTo(HttpStatus.SC_OK));
    }

    @Test
    public void updateBoardTest() {
        Board board1 = TrelloBoardServiceObj.createBoard();
        Board board2 = TrelloBoardServiceObj.createBoard();
        Board board3 = TrelloBoardServiceObj.createBoard();

        String testBoardDescription1 = "test board1 description";
        String testBoardDescription2 = "test board2 description";
        String testBoardDescription3 = "test board3 description";

        board1 = TrelloBoardServiceObj.boardApiBuilder()
                .setDescription(testBoardDescription1)
                .updateBoard(board1.getId());

        board2 = TrelloBoardServiceObj.boardApiBuilder()
                .setDescription(testBoardDescription2)
                .updateBoard(board2.getId());

        board3 = TrelloBoardServiceObj.boardApiBuilder()
                .setDescription(testBoardDescription3)
                .updateBoard(board3.getId());

        assertThat(
                Arrays.asList(board1.getDesc(), board2.getDesc(), board3.getDesc()),
                containsInAnyOrder(testBoardDescription2, testBoardDescription3, testBoardDescription1)
        );

        assertThat(TrelloBoardServiceObj.deleteBoard(board1.getId()), equalTo(HttpStatus.SC_OK));
        assertThat(TrelloBoardServiceObj.deleteBoard(board2.getId()), equalTo(HttpStatus.SC_OK));
        assertThat(TrelloBoardServiceObj.deleteBoard(board3.getId()), equalTo(HttpStatus.SC_OK));
    }

}
