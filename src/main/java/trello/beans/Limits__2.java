
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Limits__2 {

    @SerializedName("attachments")
    @Expose
    private Attachments__1 attachments;
    @SerializedName("checklists")
    @Expose
    private Checklists__1 checklists;
    @SerializedName("stickers")
    @Expose
    private Stickers__1 stickers;

    public Attachments__1 getAttachments() {
        return attachments;
    }

    public void setAttachments(Attachments__1 attachments) {
        this.attachments = attachments;
    }

    public Checklists__1 getChecklists() {
        return checklists;
    }

    public void setChecklists(Checklists__1 checklists) {
        this.checklists = checklists;
    }

    public Stickers__1 getStickers() {
        return stickers;
    }

    public void setStickers(Stickers__1 stickers) {
        this.stickers = stickers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Limits__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attachments");
        sb.append('=');
        sb.append(((this.attachments == null)?"<null>":this.attachments));
        sb.append(',');
        sb.append("checklists");
        sb.append('=');
        sb.append(((this.checklists == null)?"<null>":this.checklists));
        sb.append(',');
        sb.append("stickers");
        sb.append('=');
        sb.append(((this.stickers == null)?"<null>":this.stickers));
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
        result = ((result* 31)+((this.checklists == null)? 0 :this.checklists.hashCode()));
        result = ((result* 31)+((this.stickers == null)? 0 :this.stickers.hashCode()));
        result = ((result* 31)+((this.attachments == null)? 0 :this.attachments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Limits__2) == false) {
            return false;
        }
        Limits__2 rhs = ((Limits__2) other);
        return ((((this.checklists == rhs.checklists)||((this.checklists!= null)&&this.checklists.equals(rhs.checklists)))&&((this.stickers == rhs.stickers)||((this.stickers!= null)&&this.stickers.equals(rhs.stickers))))&&((this.attachments == rhs.attachments)||((this.attachments!= null)&&this.attachments.equals(rhs.attachments))));
    }

}
