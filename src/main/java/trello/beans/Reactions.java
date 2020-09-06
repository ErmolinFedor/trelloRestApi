
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reactions {

    @SerializedName("perAction")
    @Expose
    private PerAction perAction;
    @SerializedName("uniquePerAction")
    @Expose
    private UniquePerAction uniquePerAction;

    public PerAction getPerAction() {
        return perAction;
    }

    public void setPerAction(PerAction perAction) {
        this.perAction = perAction;
    }

    public UniquePerAction getUniquePerAction() {
        return uniquePerAction;
    }

    public void setUniquePerAction(UniquePerAction uniquePerAction) {
        this.uniquePerAction = uniquePerAction;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reactions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("perAction");
        sb.append('=');
        sb.append(((this.perAction == null)?"<null>":this.perAction));
        sb.append(',');
        sb.append("uniquePerAction");
        sb.append('=');
        sb.append(((this.uniquePerAction == null)?"<null>":this.uniquePerAction));
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
        result = ((result* 31)+((this.perAction == null)? 0 :this.perAction.hashCode()));
        result = ((result* 31)+((this.uniquePerAction == null)? 0 :this.uniquePerAction.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reactions) == false) {
            return false;
        }
        Reactions rhs = ((Reactions) other);
        return (((this.perAction == rhs.perAction)||((this.perAction!= null)&&this.perAction.equals(rhs.perAction)))&&((this.uniquePerAction == rhs.uniquePerAction)||((this.uniquePerAction!= null)&&this.uniquePerAction.equals(rhs.uniquePerAction))));
    }

}
