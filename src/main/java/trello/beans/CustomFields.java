
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomFields {

    @SerializedName("perBoard")
    @Expose
    private PerBoard__2 perBoard;

    public PerBoard__2 getPerBoard() {
        return perBoard;
    }

    public void setPerBoard(PerBoard__2 perBoard) {
        this.perBoard = perBoard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomFields.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof CustomFields) == false) {
            return false;
        }
        CustomFields rhs = ((CustomFields) other);
        return ((this.perBoard == rhs.perBoard)||((this.perBoard!= null)&&this.perBoard.equals(rhs.perBoard)));
    }

}
