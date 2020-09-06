
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NonPublic {

    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("initials")
    @Expose
    private String initials;
    @SerializedName("avatarHash")
    @Expose
    private Object avatarHash;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Object getAvatarHash() {
        return avatarHash;
    }

    public void setAvatarHash(Object avatarHash) {
        this.avatarHash = avatarHash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NonPublic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("initials");
        sb.append('=');
        sb.append(((this.initials == null)?"<null>":this.initials));
        sb.append(',');
        sb.append("avatarHash");
        sb.append('=');
        sb.append(((this.avatarHash == null)?"<null>":this.avatarHash));
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
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.avatarHash == null)? 0 :this.avatarHash.hashCode()));
        result = ((result* 31)+((this.initials == null)? 0 :this.initials.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NonPublic) == false) {
            return false;
        }
        NonPublic rhs = ((NonPublic) other);
        return ((((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName)))&&((this.avatarHash == rhs.avatarHash)||((this.avatarHash!= null)&&this.avatarHash.equals(rhs.avatarHash))))&&((this.initials == rhs.initials)||((this.initials!= null)&&this.initials.equals(rhs.initials))));
    }

}
