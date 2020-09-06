
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cards__1 {

    @SerializedName("openPerList")
    @Expose
    private OpenPerList__1 openPerList;
    @SerializedName("totalPerList")
    @Expose
    private TotalPerList__1 totalPerList;

    public OpenPerList__1 getOpenPerList() {
        return openPerList;
    }

    public void setOpenPerList(OpenPerList__1 openPerList) {
        this.openPerList = openPerList;
    }

    public TotalPerList__1 getTotalPerList() {
        return totalPerList;
    }

    public void setTotalPerList(TotalPerList__1 totalPerList) {
        this.totalPerList = totalPerList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cards__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("openPerList");
        sb.append('=');
        sb.append(((this.openPerList == null)?"<null>":this.openPerList));
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
        result = ((result* 31)+((this.totalPerList == null)? 0 :this.totalPerList.hashCode()));
        result = ((result* 31)+((this.openPerList == null)? 0 :this.openPerList.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cards__1) == false) {
            return false;
        }
        Cards__1 rhs = ((Cards__1) other);
        return (((this.totalPerList == rhs.totalPerList)||((this.totalPerList!= null)&&this.totalPerList.equals(rhs.totalPerList)))&&((this.openPerList == rhs.openPerList)||((this.openPerList!= null)&&this.openPerList.equals(rhs.openPerList))));
    }

}
