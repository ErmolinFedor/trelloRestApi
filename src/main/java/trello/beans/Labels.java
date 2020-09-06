
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Labels {

    @SerializedName("perBoard")
    @Expose
    private PerBoard__3 perBoard;

    public PerBoard__3 getPerBoard() {
        return perBoard;
    }

    public void setPerBoard(PerBoard__3 perBoard) {
        this.perBoard = perBoard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Labels.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("perBoard");
        sb.append('=');
        sb.append(((this.perBoard == null)?"<null>":this.perBoard));
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
        result = ((result* 31)+((this.perBoard == null)? 0 :this.perBoard.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Labels) == false) {
            return false;
        }
        Labels rhs = ((Labels) other);
        return ((this.perBoard == rhs.perBoard)||((this.perBoard!= null)&&this.perBoard.equals(rhs.perBoard)));
    }

}
