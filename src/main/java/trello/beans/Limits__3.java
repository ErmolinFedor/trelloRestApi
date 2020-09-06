
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Limits__3 {

    @SerializedName("cards")
    @Expose
    private Cards__1 cards;

    public Cards__1 getCards() {
        return cards;
    }

    public void setCards(Cards__1 cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Limits__3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cards");
        sb.append('=');
        sb.append(((this.cards == null)?"<null>":this.cards));
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
        result = ((result* 31)+((this.cards == null)? 0 :this.cards.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Limits__3) == false) {
            return false;
        }
        Limits__3 rhs = ((Limits__3) other);
        return ((this.cards == rhs.cards)||((this.cards!= null)&&this.cards.equals(rhs.cards)));
    }

}
