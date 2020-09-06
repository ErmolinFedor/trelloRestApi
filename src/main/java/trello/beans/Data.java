
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("old")
    @Expose
    private Old old;
    @SerializedName("board")
    @Expose
    private Board__1 board;
    @SerializedName("card")
    @Expose
    private Card card;
    @SerializedName("list")
    @Expose
    private List list;
    @SerializedName("cardSource")
    @Expose
    private CardSource cardSource;
    @SerializedName("creationMethod")
    @Expose
    private String creationMethod;

    public Old getOld() {
        return old;
    }

    public void setOld(Old old) {
        this.old = old;
    }

    public Board__1 getBoard() {
        return board;
    }

    public void setBoard(Board__1 board) {
        this.board = board;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public CardSource getCardSource() {
        return cardSource;
    }

    public void setCardSource(CardSource cardSource) {
        this.cardSource = cardSource;
    }

    public String getCreationMethod() {
        return creationMethod;
    }

    public void setCreationMethod(String creationMethod) {
        this.creationMethod = creationMethod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("old");
        sb.append('=');
        sb.append(((this.old == null)?"<null>":this.old));
        sb.append(',');
        sb.append("board");
        sb.append('=');
        sb.append(((this.board == null)?"<null>":this.board));
        sb.append(',');
        sb.append("card");
        sb.append('=');
        sb.append(((this.card == null)?"<null>":this.card));
        sb.append(',');
        sb.append("list");
        sb.append('=');
        sb.append(((this.list == null)?"<null>":this.list));
        sb.append(',');
        sb.append("cardSource");
        sb.append('=');
        sb.append(((this.cardSource == null)?"<null>":this.cardSource));
        sb.append(',');
        sb.append("creationMethod");
        sb.append('=');
        sb.append(((this.creationMethod == null)?"<null>":this.creationMethod));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.cardSource == null)? 0 :this.cardSource.hashCode()));
        result = ((result* 31)+((this.old == null)? 0 :this.old.hashCode()));
        result = ((result* 31)+((this.list == null)? 0 :this.list.hashCode()));
        result = ((result* 31)+((this.board == null)? 0 :this.board.hashCode()));
        result = ((result* 31)+((this.card == null)? 0 :this.card.hashCode()));
        result = ((result* 31)+((this.creationMethod == null)? 0 :this.creationMethod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return (((((((this.cardSource == rhs.cardSource)||((this.cardSource!= null)&&this.cardSource.equals(rhs.cardSource)))&&((this.old == rhs.old)||((this.old!= null)&&this.old.equals(rhs.old))))&&((this.list == rhs.list)||((this.list!= null)&&this.list.equals(rhs.list))))&&((this.board == rhs.board)||((this.board!= null)&&this.board.equals(rhs.board))))&&((this.card == rhs.card)||((this.card!= null)&&this.card.equals(rhs.card))))&&((this.creationMethod == rhs.creationMethod)||((this.creationMethod!= null)&&this.creationMethod.equals(rhs.creationMethod))));
    }

}
