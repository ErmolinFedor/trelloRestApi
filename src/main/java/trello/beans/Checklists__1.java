
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Checklists__1 {

    @SerializedName("perCard")
    @Expose
    private PerCard__4 perCard;

    public PerCard__4 getPerCard() {
        return perCard;
    }

    public void setPerCard(PerCard__4 perCard) {
        this.perCard = perCard;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Checklists__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Checklists__1) == false) {
            return false;
        }
        Checklists__1 rhs = ((Checklists__1) other);
        return ((this.perCard == rhs.perCard)||((this.perCard!= null)&&this.perCard.equals(rhs.perCard)));
    }

}
