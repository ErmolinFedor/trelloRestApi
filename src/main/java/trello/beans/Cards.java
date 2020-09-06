
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cards {

    @SerializedName("openPerBoard")
    @Expose
    private OpenPerBoard openPerBoard;
    @SerializedName("openPerList")
    @Expose
    private OpenPerList openPerList;
    @SerializedName("totalPerBoard")
    @Expose
    private TotalPerBoard totalPerBoard;
    @SerializedName("totalPerList")
    @Expose
    private TotalPerList totalPerList;

    public OpenPerBoard getOpenPerBoard() {
        return openPerBoard;
    }

    public void setOpenPerBoard(OpenPerBoard openPerBoard) {
        this.openPerBoard = openPerBoard;
    }

    public OpenPerList getOpenPerList() {
        return openPerList;
    }

    public void setOpenPerList(OpenPerList openPerList) {
        this.openPerList = openPerList;
    }

    public TotalPerBoard getTotalPerBoard() {
        return totalPerBoard;
    }

    public void setTotalPerBoard(TotalPerBoard totalPerBoard) {
        this.totalPerBoard = totalPerBoard;
    }

    public TotalPerList getTotalPerList() {
        return totalPerList;
    }

    public void setTotalPerList(TotalPerList totalPerList) {
        this.totalPerList = totalPerList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cards.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("openPerBoard");
        sb.append('=');
        sb.append(((this.openPerBoard == null)?"<null>":this.openPerBoard));
        sb.append(',');
        sb.append("openPerList");
        sb.append('=');
        sb.append(((this.openPerList == null)?"<null>":this.openPerList));
        sb.append(',');
        sb.append("totalPerBoard");
        sb.append('=');
        sb.append(((this.totalPerBoard == null)?"<null>":this.totalPerBoard));
        sb.append(',');
        sb.append("totalPerList");
        sb.append('=');
        sb.append(((this.totalPerList == null)?"<null>":this.totalPerList));
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
        result = ((result* 31)+((this.openPerBoard == null)? 0 :this.openPerBoard.hashCode()));
        result = ((result* 31)+((this.openPerList == null)? 0 :this.openPerList.hashCode()));
        result = ((result* 31)+((this.totalPerList == null)? 0 :this.totalPerList.hashCode()));
        result = ((result* 31)+((this.totalPerBoard == null)? 0 :this.totalPerBoard.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cards) == false) {
            return false;
        }
        Cards rhs = ((Cards) other);
        return (((((this.openPerBoard == rhs.openPerBoard)||((this.openPerBoard!= null)&&this.openPerBoard.equals(rhs.openPerBoard)))&&((this.openPerList == rhs.openPerList)||((this.openPerList!= null)&&this.openPerList.equals(rhs.openPerList))))&&((this.totalPerList == rhs.totalPerList)||((this.totalPerList!= null)&&this.totalPerList.equals(rhs.totalPerList))))&&((this.totalPerBoard == rhs.totalPerBoard)||((this.totalPerBoard!= null)&&this.totalPerBoard.equals(rhs.totalPerBoard))));
    }

}
