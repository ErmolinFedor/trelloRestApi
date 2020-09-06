
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MemberCreator {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("activityBlocked")
    @Expose
    private Boolean activityBlocked;
    @SerializedName("avatarHash")
    @Expose
    private Object avatarHash;
    @SerializedName("avatarUrl")
    @Expose
    private Object avatarUrl;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("idMemberReferrer")
    @Expose
    private Object idMemberReferrer;
    @SerializedName("initials")
    @Expose
    private String initials;
    @SerializedName("nonPublic")
    @Expose
    private NonPublic nonPublic;
    @SerializedName("nonPublicAvailable")
    @Expose
    private Boolean nonPublicAvailable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getActivityBlocked() {
        return activityBlocked;
    }

    public void setActivityBlocked(Boolean activityBlocked) {
        this.activityBlocked = activityBlocked;
    }

    public Object getAvatarHash() {
        return avatarHash;
    }

    public void setAvatarHash(Object avatarHash) {
        this.avatarHash = avatarHash;
    }

    public Object getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(Object avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Object getIdMemberReferrer() {
        return idMemberReferrer;
    }

    public void setIdMemberReferrer(Object idMemberReferrer) {
        this.idMemberReferrer = idMemberReferrer;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public NonPublic getNonPublic() {
        return nonPublic;
    }

    public void setNonPublic(NonPublic nonPublic) {
        this.nonPublic = nonPublic;
    }

    public Boolean getNonPublicAvailable() {
        return nonPublicAvailable;
    }

    public void setNonPublicAvailable(Boolean nonPublicAvailable) {
        this.nonPublicAvailable = nonPublicAvailable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MemberCreator.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("activityBlocked");
        sb.append('=');
        sb.append(((this.activityBlocked == null)?"<null>":this.activityBlocked));
        sb.append(',');
        sb.append("avatarHash");
        sb.append('=');
        sb.append(((this.avatarHash == null)?"<null>":this.avatarHash));
        sb.append(',');
        sb.append("avatarUrl");
        sb.append('=');
        sb.append(((this.avatarUrl == null)?"<null>":this.avatarUrl));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("idMemberReferrer");
        sb.append('=');
        sb.append(((this.idMemberReferrer == null)?"<null>":this.idMemberReferrer));
        sb.append(',');
        sb.append("initials");
        sb.append('=');
        sb.append(((this.initials == null)?"<null>":this.initials));
        sb.append(',');
        sb.append("nonPublic");
        sb.append('=');
        sb.append(((this.nonPublic == null)?"<null>":this.nonPublic));
        sb.append(',');
        sb.append("nonPublicAvailable");
        sb.append('=');
        sb.append(((this.nonPublicAvailable == null)?"<null>":this.nonPublicAvailable));
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
        result = ((result* 31)+((this.activityBlocked == null)? 0 :this.activityBlocked.hashCode()));
        result = ((result* 31)+((this.avatarHash == null)? 0 :this.avatarHash.hashCode()));
        result = ((result* 31)+((this.avatarUrl == null)? 0 :this.avatarUrl.hashCode()));
        result = ((result* 31)+((this.initials == null)? 0 :this.initials.hashCode()));
        result = ((result* 31)+((this.nonPublicAvailable == null)? 0 :this.nonPublicAvailable.hashCode()));
        result = ((result* 31)+((this.idMemberReferrer == null)? 0 :this.idMemberReferrer.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.nonPublic == null)? 0 :this.nonPublic.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemberCreator) == false) {
            return false;
        }
        MemberCreator rhs = ((MemberCreator) other);
        return (((((((((((this.activityBlocked == rhs.activityBlocked)||((this.activityBlocked!= null)&&this.activityBlocked.equals(rhs.activityBlocked)))&&((this.avatarHash == rhs.avatarHash)||((this.avatarHash!= null)&&this.avatarHash.equals(rhs.avatarHash))))&&((this.avatarUrl == rhs.avatarUrl)||((this.avatarUrl!= null)&&this.avatarUrl.equals(rhs.avatarUrl))))&&((this.initials == rhs.initials)||((this.initials!= null)&&this.initials.equals(rhs.initials))))&&((this.nonPublicAvailable == rhs.nonPublicAvailable)||((this.nonPublicAvailable!= null)&&this.nonPublicAvailable.equals(rhs.nonPublicAvailable))))&&((this.idMemberReferrer == rhs.idMemberReferrer)||((this.idMemberReferrer!= null)&&this.idMemberReferrer.equals(rhs.idMemberReferrer))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.nonPublic == rhs.nonPublic)||((this.nonPublic!= null)&&this.nonPublic.equals(rhs.nonPublic))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
