
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Boards {

    @SerializedName("totalMembersPerBoard")
    @Expose
    private TotalMembersPerBoard totalMembersPerBoard;

    public TotalMembersPerBoard getTotalMembersPerBoard() {
        return totalMembersPerBoard;
    }

    public void setTotalMembersPerBoard(TotalMembersPerBoard totalMembersPerBoard) {
        this.totalMembersPerBoard = totalMembersPerBoard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Boards.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totalMembersPerBoard");
        sb.append('=');
        sb.append(((this.totalMembersPerBoard == null)?"<null>":this.totalMembersPerBoard));
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
        result = ((result* 31)+((this.totalMembersPerBoard == null)? 0 :this.totalMembersPerBoard.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Boards) == false) {
            return false;
        }
        Boards rhs = ((Boards) other);
        return ((this.totalMembersPerBoard == rhs.totalMembersPerBoard)||((this.totalMembersPerBoard!= null)&&this.totalMembersPerBoard.equals(rhs.totalMembersPerBoard)));
    }

}
