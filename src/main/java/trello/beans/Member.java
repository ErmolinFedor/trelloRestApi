
package trello.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Member {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("bioData")
    @Expose
    private Object bioData;
    @SerializedName("confirmed")
    @Expose
    private Boolean confirmed;
    @SerializedName("memberType")
    @Expose
    private String memberType;
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
    @SerializedName("idEnterprise")
    @Expose
    private Object idEnterprise;
    @SerializedName("idEnterprisesDeactivated")
    @Expose
    private List<Object> idEnterprisesDeactivated = new ArrayList<Object>();
    @SerializedName("idMemberReferrer")
    @Expose
    private Object idMemberReferrer;
    @SerializedName("idPremOrgsAdmin")
    @Expose
    private List<Object> idPremOrgsAdmin = new ArrayList<Object>();
    @SerializedName("initials")
    @Expose
    private String initials;
    @SerializedName("nonPublic")
    @Expose
    private NonPublic__1 nonPublic;
    @SerializedName("nonPublicAvailable")
    @Expose
    private Boolean nonPublicAvailable;
    @SerializedName("products")
    @Expose
    private List<Object> products = new ArrayList<Object>();
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("status")
    @Expose
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Object getBioData() {
        return bioData;
    }

    public void setBioData(Object bioData) {
        this.bioData = bioData;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
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

    public Object getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(Object idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public List<Object> getIdEnterprisesDeactivated() {
        return idEnterprisesDeactivated;
    }

    public void setIdEnterprisesDeactivated(List<Object> idEnterprisesDeactivated) {
        this.idEnterprisesDeactivated = idEnterprisesDeactivated;
    }

    public Object getIdMemberReferrer() {
        return idMemberReferrer;
    }

    public void setIdMemberReferrer(Object idMemberReferrer) {
        this.idMemberReferrer = idMemberReferrer;
    }

    public List<Object> getIdPremOrgsAdmin() {
        return idPremOrgsAdmin;
    }

    public void setIdPremOrgsAdmin(List<Object> idPremOrgsAdmin) {
        this.idPremOrgsAdmin = idPremOrgsAdmin;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public NonPublic__1 getNonPublic() {
        return nonPublic;
    }

    public void setNonPublic(NonPublic__1 nonPublic) {
        this.nonPublic = nonPublic;
    }

    public Boolean getNonPublicAvailable() {
        return nonPublicAvailable;
    }

    public void setNonPublicAvailable(Boolean nonPublicAvailable) {
        this.nonPublicAvailable = nonPublicAvailable;
    }

    public List<Object> getProducts() {
        return products;
    }

    public void setProducts(List<Object> products) {
        this.products = products;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Member.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("bio");
        sb.append('=');
        sb.append(((this.bio == null)?"<null>":this.bio));
        sb.append(',');
        sb.append("bioData");
        sb.append('=');
        sb.append(((this.bioData == null)?"<null>":this.bioData));
        sb.append(',');
        sb.append("confirmed");
        sb.append('=');
        sb.append(((this.confirmed == null)?"<null>":this.confirmed));
        sb.append(',');
        sb.append("memberType");
        sb.append('=');
        sb.append(((this.memberType == null)?"<null>":this.memberType));
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
        sb.append("idEnterprise");
        sb.append('=');
        sb.append(((this.idEnterprise == null)?"<null>":this.idEnterprise));
        sb.append(',');
        sb.append("idEnterprisesDeactivated");
        sb.append('=');
        sb.append(((this.idEnterprisesDeactivated == null)?"<null>":this.idEnterprisesDeactivated));
        sb.append(',');
        sb.append("idMemberReferrer");
        sb.append('=');
        sb.append(((this.idMemberReferrer == null)?"<null>":this.idMemberReferrer));
        sb.append(',');
        sb.append("idPremOrgsAdmin");
        sb.append('=');
        sb.append(((this.idPremOrgsAdmin == null)?"<null>":this.idPremOrgsAdmin));
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
        sb.append("products");
        sb.append('=');
        sb.append(((this.products == null)?"<null>":this.products));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.idEnterprisesDeactivated == null)? 0 :this.idEnterprisesDeactivated.hashCode()));
        result = ((result* 31)+((this.avatarUrl == null)? 0 :this.avatarUrl.hashCode()));
        result = ((result* 31)+((this.initials == null)? 0 :this.initials.hashCode()));
        result = ((result* 31)+((this.nonPublicAvailable == null)? 0 :this.nonPublicAvailable.hashCode()));
        result = ((result* 31)+((this.idMemberReferrer == null)? 0 :this.idMemberReferrer.hashCode()));
        result = ((result* 31)+((this.bio == null)? 0 :this.bio.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.nonPublic == null)? 0 :this.nonPublic.hashCode()));
        result = ((result* 31)+((this.confirmed == null)? 0 :this.confirmed.hashCode()));
        result = ((result* 31)+((this.idPremOrgsAdmin == null)? 0 :this.idPremOrgsAdmin.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.products == null)? 0 :this.products.hashCode()));
        result = ((result* 31)+((this.activityBlocked == null)? 0 :this.activityBlocked.hashCode()));
        result = ((result* 31)+((this.avatarHash == null)? 0 :this.avatarHash.hashCode()));
        result = ((result* 31)+((this.idEnterprise == null)? 0 :this.idEnterprise.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.memberType == null)? 0 :this.memberType.hashCode()));
        result = ((result* 31)+((this.bioData == null)? 0 :this.bioData.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Member) == false) {
            return false;
        }
        Member rhs = ((Member) other);
        return (((((((((((((((((((((this.idEnterprisesDeactivated == rhs.idEnterprisesDeactivated)||((this.idEnterprisesDeactivated!= null)&&this.idEnterprisesDeactivated.equals(rhs.idEnterprisesDeactivated)))&&((this.avatarUrl == rhs.avatarUrl)||((this.avatarUrl!= null)&&this.avatarUrl.equals(rhs.avatarUrl))))&&((this.initials == rhs.initials)||((this.initials!= null)&&this.initials.equals(rhs.initials))))&&((this.nonPublicAvailable == rhs.nonPublicAvailable)||((this.nonPublicAvailable!= null)&&this.nonPublicAvailable.equals(rhs.nonPublicAvailable))))&&((this.idMemberReferrer == rhs.idMemberReferrer)||((this.idMemberReferrer!= null)&&this.idMemberReferrer.equals(rhs.idMemberReferrer))))&&((this.bio == rhs.bio)||((this.bio!= null)&&this.bio.equals(rhs.bio))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.nonPublic == rhs.nonPublic)||((this.nonPublic!= null)&&this.nonPublic.equals(rhs.nonPublic))))&&((this.confirmed == rhs.confirmed)||((this.confirmed!= null)&&this.confirmed.equals(rhs.confirmed))))&&((this.idPremOrgsAdmin == rhs.idPremOrgsAdmin)||((this.idPremOrgsAdmin!= null)&&this.idPremOrgsAdmin.equals(rhs.idPremOrgsAdmin))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.products == rhs.products)||((this.products!= null)&&this.products.equals(rhs.products))))&&((this.activityBlocked == rhs.activityBlocked)||((this.activityBlocked!= null)&&this.activityBlocked.equals(rhs.activityBlocked))))&&((this.avatarHash == rhs.avatarHash)||((this.avatarHash!= null)&&this.avatarHash.equals(rhs.avatarHash))))&&((this.idEnterprise == rhs.idEnterprise)||((this.idEnterprise!= null)&&this.idEnterprise.equals(rhs.idEnterprise))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.memberType == rhs.memberType)||((this.memberType!= null)&&this.memberType.equals(rhs.memberType))))&&((this.bioData == rhs.bioData)||((this.bioData!= null)&&this.bioData.equals(rhs.bioData))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
