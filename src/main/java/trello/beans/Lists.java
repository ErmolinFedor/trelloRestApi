
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lists {

    @SerializedName("openPerBoard")
    @Expose
    private OpenPerBoard__1 openPerBoard;
    @SerializedName("totalPerBoard")
    @Expose
    private TotalPerBoard__1 totalPerBoard;

    public OpenPerBoard__1 getOpenPerBoard() {
        return openPerBoard;
    }

    public void setOpenPerBoard(OpenPerBoard__1 openPerBoard) {
        this.openPerBoard = openPerBoard;
    }

    public TotalPerBoard__1 getTotalPerBoard() {
        return totalPerBoard;
    }

    public void setTotalPerBoard(TotalPerBoard__1 totalPerBoard) {
        this.totalPerBoard = totalPerBoard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Lists.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("openPerBoard");
        sb.append('=');
        sb.append(((this.openPerBoard == null)?"<null>":this.openPerBoard));
        sb.append(',');
        sb.append("totalPerBoard");
        sb.append('=');
        sb.append(((this.totalPerBoard == null)?"<null>":this.totalPerBoard));
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
        result = ((result* 31)+((this.totalPerBoard == null)? 0 :this.totalPerBoard.hashCode()));
        result = ((result* 31)+((this.openPerBoard == null)? 0 :this.openPerBoard.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Lists) == false) {
            return false;
        }
        Lists rhs = ((Lists) other);
        return (((this.totalPerBoard == rhs.totalPerBoard)||((this.totalPerBoard!= null)&&this.totalPerBoard.equals(rhs.totalPerBoard)))&&((this.openPerBoard == rhs.openPerBoard)||((this.openPerBoard!= null)&&this.openPerBoard.equals(rhs.openPerBoard))));
    }

}
