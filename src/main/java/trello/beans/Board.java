
package trello.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Board {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("descData")
    @Expose
    private Object descData;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("idOrganization")
    @Expose
    private Object idOrganization;
    @SerializedName("shortLink")
    @Expose
    private String shortLink;
    @SerializedName("powerUps")
    @Expose
    private List<Object> powerUps = new ArrayList<Object>();
    @SerializedName("dateLastActivity")
    @Expose
    private String dateLastActivity;
    @SerializedName("idTags")
    @Expose
    private List<Object> idTags = new ArrayList<Object>();
    @SerializedName("datePluginDisable")
    @Expose
    private Object datePluginDisable;
    @SerializedName("creationMethod")
    @Expose
    private String creationMethod;
    @SerializedName("idBoardSource")
    @Expose
    private Object idBoardSource;
    @SerializedName("idEnterprise")
    @Expose
    private Object idEnterprise;
    @SerializedName("pinned")
    @Expose
    private Boolean pinned;
    @SerializedName("starred")
    @Expose
    private Boolean starred;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("shortUrl")
    @Expose
    private String shortUrl;
    @SerializedName("enterpriseOwned")
    @Expose
    private Boolean enterpriseOwned;
    @SerializedName("premiumFeatures")
    @Expose
    private List<Object> premiumFeatures = new ArrayList<Object>();
    @SerializedName("ixUpdate")
    @Expose
    private String ixUpdate;
    @SerializedName("limits")
    @Expose
    private Limits limits;
    @SerializedName("prefs")
    @Expose
    private Prefs prefs;
    @SerializedName("subscribed")
    @Expose
    private Boolean subscribed;
    @SerializedName("templateGallery")
    @Expose
    private Object templateGallery;
    @SerializedName("dateLastView")
    @Expose
    private String dateLastView;
    @SerializedName("labelNames")
    @Expose
    private LabelNames labelNames;
    @SerializedName("actions")
    @Expose
    private List<Action> actions = new ArrayList<Action>();
    @SerializedName("cards")
    @Expose
    private List<Card__1> cards = new ArrayList<Card__1>();
    @SerializedName("labels")
    @Expose
    private List<Label> labels = new ArrayList<Label>();
    @SerializedName("lists")
    @Expose
    private List<List__1> lists = new ArrayList<List__1>();
    @SerializedName("members")
    @Expose
    private List<Member> members = new ArrayList<Member>();
    @SerializedName("checklists")
    @Expose
    private List<Object> checklists = new ArrayList<Object>();
    @SerializedName("customFields")
    @Expose
    private List<Object> customFields = new ArrayList<Object>();
    @SerializedName("memberships")
    @Expose
    private List<Membership> memberships = new ArrayList<Membership>();
    @SerializedName("pluginData")
    @Expose
    private List<Object> pluginData = new ArrayList<Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getDescData() {
        return descData;
    }

    public void setDescData(Object descData) {
        this.descData = descData;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Object getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Object idOrganization) {
        this.idOrganization = idOrganization;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public List<Object> getPowerUps() {
        return powerUps;
    }

    public void setPowerUps(List<Object> powerUps) {
        this.powerUps = powerUps;
    }

    public String getDateLastActivity() {
        return dateLastActivity;
    }

    public void setDateLastActivity(String dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    public List<Object> getIdTags() {
        return idTags;
    }

    public void setIdTags(List<Object> idTags) {
        this.idTags = idTags;
    }

    public Object getDatePluginDisable() {
        return datePluginDisable;
    }

    public void setDatePluginDisable(Object datePluginDisable) {
        this.datePluginDisable = datePluginDisable;
    }

    public String getCreationMethod() {
        return creationMethod;
    }

    public void setCreationMethod(String creationMethod) {
        this.creationMethod = creationMethod;
    }

    public Object getIdBoardSource() {
        return idBoardSource;
    }

    public void setIdBoardSource(Object idBoardSource) {
        this.idBoardSource = idBoardSource;
    }

    public Object getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(Object idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Boolean getEnterpriseOwned() {
        return enterpriseOwned;
    }

    public void setEnterpriseOwned(Boolean enterpriseOwned) {
        this.enterpriseOwned = enterpriseOwned;
    }

    public List<Object> getPremiumFeatures() {
        return premiumFeatures;
    }

    public void setPremiumFeatures(List<Object> premiumFeatures) {
        this.premiumFeatures = premiumFeatures;
    }

    public String getIxUpdate() {
        return ixUpdate;
    }

    public void setIxUpdate(String ixUpdate) {
        this.ixUpdate = ixUpdate;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    public Prefs getPrefs() {
        return prefs;
    }

    public void setPrefs(Prefs prefs) {
        this.prefs = prefs;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public Object getTemplateGallery() {
        return templateGallery;
    }

    public void setTemplateGallery(Object templateGallery) {
        this.templateGallery = templateGallery;
    }

    public String getDateLastView() {
        return dateLastView;
    }

    public void setDateLastView(String dateLastView) {
        this.dateLastView = dateLastView;
    }

    public LabelNames getLabelNames() {
        return labelNames;
    }

    public void setLabelNames(LabelNames labelNames) {
        this.labelNames = labelNames;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Card__1> getCards() {
        return cards;
    }

    public void setCards(List<Card__1> cards) {
        this.cards = cards;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public List<List__1> getLists() {
        return lists;
    }

    public void setLists(List<List__1> lists) {
        this.lists = lists;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Object> getChecklists() {
        return checklists;
    }

    public void setChecklists(List<Object> checklists) {
        this.checklists = checklists;
    }

    public List<Object> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<Object> customFields) {
        this.customFields = customFields;
    }

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }

    public List<Object> getPluginData() {
        return pluginData;
    }

    public void setPluginData(List<Object> pluginData) {
        this.pluginData = pluginData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Board.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("descData");
        sb.append('=');
        sb.append(((this.descData == null)?"<null>":this.descData));
        sb.append(',');
        sb.append("closed");
        sb.append('=');
        sb.append(((this.closed == null)?"<null>":this.closed));
        sb.append(',');
        sb.append("idOrganization");
        sb.append('=');
        sb.append(((this.idOrganization == null)?"<null>":this.idOrganization));
        sb.append(',');
        sb.append("shortLink");
        sb.append('=');
        sb.append(((this.shortLink == null)?"<null>":this.shortLink));
        sb.append(',');
        sb.append("powerUps");
        sb.append('=');
        sb.append(((this.powerUps == null)?"<null>":this.powerUps));
        sb.append(',');
        sb.append("dateLastActivity");
        sb.append('=');
        sb.append(((this.dateLastActivity == null)?"<null>":this.dateLastActivity));
        sb.append(',');
        sb.append("idTags");
        sb.append('=');
        sb.append(((this.idTags == null)?"<null>":this.idTags));
        sb.append(',');
        sb.append("datePluginDisable");
        sb.append('=');
        sb.append(((this.datePluginDisable == null)?"<null>":this.datePluginDisable));
        sb.append(',');
        sb.append("creationMethod");
        sb.append('=');
        sb.append(((this.creationMethod == null)?"<null>":this.creationMethod));
        sb.append(',');
        sb.append("idBoardSource");
        sb.append('=');
        sb.append(((this.idBoardSource == null)?"<null>":this.idBoardSource));
        sb.append(',');
        sb.append("idEnterprise");
        sb.append('=');
        sb.append(((this.idEnterprise == null)?"<null>":this.idEnterprise));
        sb.append(',');
        sb.append("pinned");
        sb.append('=');
        sb.append(((this.pinned == null)?"<null>":this.pinned));
        sb.append(',');
        sb.append("starred");
        sb.append('=');
        sb.append(((this.starred == null)?"<null>":this.starred));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("shortUrl");
        sb.append('=');
        sb.append(((this.shortUrl == null)?"<null>":this.shortUrl));
        sb.append(',');
        sb.append("enterpriseOwned");
        sb.append('=');
        sb.append(((this.enterpriseOwned == null)?"<null>":this.enterpriseOwned));
        sb.append(',');
        sb.append("premiumFeatures");
        sb.append('=');
        sb.append(((this.premiumFeatures == null)?"<null>":this.premiumFeatures));
        sb.append(',');
        sb.append("ixUpdate");
        sb.append('=');
        sb.append(((this.ixUpdate == null)?"<null>":this.ixUpdate));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
        sb.append(',');
        sb.append("prefs");
        sb.append('=');
        sb.append(((this.prefs == null)?"<null>":this.prefs));
        sb.append(',');
        sb.append("subscribed");
        sb.append('=');
        sb.append(((this.subscribed == null)?"<null>":this.subscribed));
        sb.append(',');
        sb.append("templateGallery");
        sb.append('=');
        sb.append(((this.templateGallery == null)?"<null>":this.templateGallery));
        sb.append(',');
        sb.append("dateLastView");
        sb.append('=');
        sb.append(((this.dateLastView == null)?"<null>":this.dateLastView));
        sb.append(',');
        sb.append("labelNames");
        sb.append('=');
        sb.append(((this.labelNames == null)?"<null>":this.labelNames));
        sb.append(',');
        sb.append("actions");
        sb.append('=');
        sb.append(((this.actions == null)?"<null>":this.actions));
        sb.append(',');
        sb.append("cards");
        sb.append('=');
        sb.append(((this.cards == null)?"<null>":this.cards));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("lists");
        sb.append('=');
        sb.append(((this.lists == null)?"<null>":this.lists));
        sb.append(',');
        sb.append("members");
        sb.append('=');
        sb.append(((this.members == null)?"<null>":this.members));
        sb.append(',');
        sb.append("checklists");
        sb.append('=');
        sb.append(((this.checklists == null)?"<null>":this.checklists));
        sb.append(',');
        sb.append("customFields");
        sb.append('=');
        sb.append(((this.customFields == null)?"<null>":this.customFields));
        sb.append(',');
        sb.append("memberships");
        sb.append('=');
        sb.append(((this.memberships == null)?"<null>":this.memberships));
        sb.append(',');
        sb.append("pluginData");
        sb.append('=');
        sb.append(((this.pluginData == null)?"<null>":this.pluginData));
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
        result = ((result* 31)+((this.descData == null)? 0 :this.descData.hashCode()));
        result = ((result* 31)+((this.checklists == null)? 0 :this.checklists.hashCode()));
        result = ((result* 31)+((this.idTags == null)? 0 :this.idTags.hashCode()));
        result = ((result* 31)+((this.pinned == null)? 0 :this.pinned.hashCode()));
        result = ((result* 31)+((this.labelNames == null)? 0 :this.labelNames.hashCode()));
        result = ((result* 31)+((this.cards == null)? 0 :this.cards.hashCode()));
        result = ((result* 31)+((this.shortUrl == null)? 0 :this.shortUrl.hashCode()));
        result = ((result* 31)+((this.customFields == null)? 0 :this.customFields.hashCode()));
        result = ((result* 31)+((this.dateLastActivity == null)? 0 :this.dateLastActivity.hashCode()));
        result = ((result* 31)+((this.datePluginDisable == null)? 0 :this.datePluginDisable.hashCode()));
        result = ((result* 31)+((this.shortLink == null)? 0 :this.shortLink.hashCode()));
        result = ((result* 31)+((this.idBoardSource == null)? 0 :this.idBoardSource.hashCode()));
        result = ((result* 31)+((this.memberships == null)? 0 :this.memberships.hashCode()));
        result = ((result* 31)+((this.creationMethod == null)? 0 :this.creationMethod.hashCode()));
        result = ((result* 31)+((this.subscribed == null)? 0 :this.subscribed.hashCode()));
        result = ((result* 31)+((this.starred == null)? 0 :this.starred.hashCode()));
        result = ((result* 31)+((this.members == null)? 0 :this.members.hashCode()));
        result = ((result* 31)+((this.idOrganization == null)? 0 :this.idOrganization.hashCode()));
        result = ((result* 31)+((this.dateLastView == null)? 0 :this.dateLastView.hashCode()));
        result = ((result* 31)+((this.pluginData == null)? 0 :this.pluginData.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
        result = ((result* 31)+((this.powerUps == null)? 0 :this.powerUps.hashCode()));
        result = ((result* 31)+((this.templateGallery == null)? 0 :this.templateGallery.hashCode()));
        result = ((result* 31)+((this.premiumFeatures == null)? 0 :this.premiumFeatures.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.prefs == null)? 0 :this.prefs.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        result = ((result* 31)+((this.enterpriseOwned == null)? 0 :this.enterpriseOwned.hashCode()));
        result = ((result* 31)+((this.ixUpdate == null)? 0 :this.ixUpdate.hashCode()));
        result = ((result* 31)+((this.lists == null)? 0 :this.lists.hashCode()));
        result = ((result* 31)+((this.idEnterprise == null)? 0 :this.idEnterprise.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.closed == null)? 0 :this.closed.hashCode()));
        result = ((result* 31)+((this.actions == null)? 0 :this.actions.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Board) == false) {
            return false;
        }
        Board rhs = ((Board) other);
        return (((((((((((((((((((((((((((((((((((((this.descData == rhs.descData)||((this.descData!= null)&&this.descData.equals(rhs.descData)))&&((this.checklists == rhs.checklists)||((this.checklists!= null)&&this.checklists.equals(rhs.checklists))))&&((this.idTags == rhs.idTags)||((this.idTags!= null)&&this.idTags.equals(rhs.idTags))))&&((this.pinned == rhs.pinned)||((this.pinned!= null)&&this.pinned.equals(rhs.pinned))))&&((this.labelNames == rhs.labelNames)||((this.labelNames!= null)&&this.labelNames.equals(rhs.labelNames))))&&((this.cards == rhs.cards)||((this.cards!= null)&&this.cards.equals(rhs.cards))))&&((this.shortUrl == rhs.shortUrl)||((this.shortUrl!= null)&&this.shortUrl.equals(rhs.shortUrl))))&&((this.customFields == rhs.customFields)||((this.customFields!= null)&&this.customFields.equals(rhs.customFields))))&&((this.dateLastActivity == rhs.dateLastActivity)||((this.dateLastActivity!= null)&&this.dateLastActivity.equals(rhs.dateLastActivity))))&&((this.datePluginDisable == rhs.datePluginDisable)||((this.datePluginDisable!= null)&&this.datePluginDisable.equals(rhs.datePluginDisable))))&&((this.shortLink == rhs.shortLink)||((this.shortLink!= null)&&this.shortLink.equals(rhs.shortLink))))&&((this.idBoardSource == rhs.idBoardSource)||((this.idBoardSource!= null)&&this.idBoardSource.equals(rhs.idBoardSource))))&&((this.memberships == rhs.memberships)||((this.memberships!= null)&&this.memberships.equals(rhs.memberships))))&&((this.creationMethod == rhs.creationMethod)||((this.creationMethod!= null)&&this.creationMethod.equals(rhs.creationMethod))))&&((this.subscribed == rhs.subscribed)||((this.subscribed!= null)&&this.subscribed.equals(rhs.subscribed))))&&((this.starred == rhs.starred)||((this.starred!= null)&&this.starred.equals(rhs.starred))))&&((this.members == rhs.members)||((this.members!= null)&&this.members.equals(rhs.members))))&&((this.idOrganization == rhs.idOrganization)||((this.idOrganization!= null)&&this.idOrganization.equals(rhs.idOrganization))))&&((this.dateLastView == rhs.dateLastView)||((this.dateLastView!= null)&&this.dateLastView.equals(rhs.dateLastView))))&&((this.pluginData == rhs.pluginData)||((this.pluginData!= null)&&this.pluginData.equals(rhs.pluginData))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))))&&((this.powerUps == rhs.powerUps)||((this.powerUps!= null)&&this.powerUps.equals(rhs.powerUps))))&&((this.templateGallery == rhs.templateGallery)||((this.templateGallery!= null)&&this.templateGallery.equals(rhs.templateGallery))))&&((this.premiumFeatures == rhs.premiumFeatures)||((this.premiumFeatures!= null)&&this.premiumFeatures.equals(rhs.premiumFeatures))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.prefs == rhs.prefs)||((this.prefs!= null)&&this.prefs.equals(rhs.prefs))))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))))&&((this.enterpriseOwned == rhs.enterpriseOwned)||((this.enterpriseOwned!= null)&&this.enterpriseOwned.equals(rhs.enterpriseOwned))))&&((this.ixUpdate == rhs.ixUpdate)||((this.ixUpdate!= null)&&this.ixUpdate.equals(rhs.ixUpdate))))&&((this.lists == rhs.lists)||((this.lists!= null)&&this.lists.equals(rhs.lists))))&&((this.idEnterprise == rhs.idEnterprise)||((this.idEnterprise!= null)&&this.idEnterprise.equals(rhs.idEnterprise))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.closed == rhs.closed)||((this.closed!= null)&&this.closed.equals(rhs.closed))))&&((this.actions == rhs.actions)||((this.actions!= null)&&this.actions.equals(rhs.actions))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
