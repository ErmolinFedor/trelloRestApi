
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckItems {

    @SerializedName("perChecklist")
    @Expose
    private PerChecklist perChecklist;

    public PerChecklist getPerChecklist() {
        return perChecklist;
    }

    public void setPerChecklist(PerChecklist perChecklist) {
        this.perChecklist = perChecklist;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CheckItems.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("perChecklist");
        sb.append('=');
        sb.append(((this.perChecklist == null)?"<null>":this.perChecklist));
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
        result = ((result* 31)+((this.perChecklist == null)? 0 :this.perChecklist.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CheckItems) == false) {
            return false;
        }
        CheckItems rhs = ((CheckItems) other);
        return ((this.perChecklist == rhs.perChecklist)||((this.perChecklist!= null)&&this.perChecklist.equals(rhs.perChecklist)));
    }

}
