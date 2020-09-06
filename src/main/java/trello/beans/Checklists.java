
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Checklists {

    @SerializedName("perBoard")
    @Expose
    private PerBoard__1 perBoard;
    @SerializedName("perCard")
    @Expose
    private PerCard__1 perCard;

    public PerBoard__1 getPerBoard() {
        return perBoard;
    }

    public void setPerBoard(PerBoard__1 perBoard) {
        this.perBoard = perBoard;
    }

    public PerCard__1 getPerCard() {
        return perCard;
    }

    public void setPerCard(PerCard__1 perCard) {
        this.perCard = perCard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Checklists.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("perBoard");
        sb.append('=');
        sb.append(((this.perBoard == null)?"<null>":this.perBoard));
        sb.append(',');
        sb.append("perCard");
        sb.append('=');
        sb.append(((this.perCard == null)?"<null>":this.perCard));
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
        result = ((result* 31)+((this.perCard == null)? 0 :this.perCard.hashCode()));
        result = ((result* 31)+((this.perBoard == null)? 0 :this.perBoard.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Checklists) == false) {
            return false;
        }
        Checklists rhs = ((Checklists) other);
        return (((this.perCard == rhs.perCard)||((this.perCard!= null)&&this.perCard.equals(rhs.perCard)))&&((this.perBoard == rhs.perBoard)||((this.perBoard!= null)&&this.perBoard.equals(rhs.perBoard))));
    }

}
