
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Limits {

    @SerializedName("attachments")
    @Expose
    private Attachments attachments;
    @SerializedName("boards")
    @Expose
    private Boards boards;
    @SerializedName("cards")
    @Expose
    private Cards cards;
    @SerializedName("checklists")
    @Expose
    private Checklists checklists;
    @SerializedName("checkItems")
    @Expose
    private CheckItems checkItems;
    @SerializedName("customFields")
    @Expose
    private CustomFields customFields;
    @SerializedName("customFieldOptions")
    @Expose
    private CustomFieldOptions customFieldOptions;
    @SerializedName("labels")
    @Expose
    private Labels labels;
    @SerializedName("lists")
    @Expose
    private Lists lists;
    @SerializedName("stickers")
    @Expose
    private Stickers stickers;
    @SerializedName("reactions")
    @Expose
    private Reactions reactions;

    public Attachments getAttachments() {
        return attachments;
    }

    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }

    public Boards getBoards() {
        return boards;
    }

    public void setBoards(Boards boards) {
        this.boards = boards;
    }

    public Cards getCards() {
        return cards;
    }

    public void setCards(Cards cards) {
        this.cards = cards;
    }

    public Checklists getChecklists() {
        return checklists;
    }

    public void setChecklists(Checklists checklists) {
        this.checklists = checklists;
    }

    public CheckItems getCheckItems() {
        return checkItems;
    }

    public void setCheckItems(CheckItems checkItems) {
        this.checkItems = checkItems;
    }

    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    public CustomFieldOptions getCustomFieldOptions() {
        return customFieldOptions;
    }

    public void setCustomFieldOptions(CustomFieldOptions customFieldOptions) {
        this.customFieldOptions = customFieldOptions;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public Lists getLists() {
        return lists;
    }

    public void setLists(Lists lists) {
        this.lists = lists;
    }

    public Stickers getStickers() {
        return stickers;
    }

    public void setStickers(Stickers stickers) {
        this.stickers = stickers;
    }

    public Reactions getReactions() {
        return reactions;
    }

    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Limits.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attachments");
        sb.append('=');
        sb.append(((this.attachments == null)?"<null>":this.attachments));
        sb.append(',');
        sb.append("boards");
        sb.append('=');
        sb.append(((this.boards == null)?"<null>":this.boards));
        sb.append(',');
        sb.append("cards");
        sb.append('=');
        sb.append(((this.cards == null)?"<null>":this.cards));
        sb.append(',');
        sb.append("checklists");
        sb.append('=');
        sb.append(((this.checklists == null)?"<null>":this.checklists));
        sb.append(',');
        sb.append("checkItems");
        sb.append('=');
        sb.append(((this.checkItems == null)?"<null>":this.checkItems));
        sb.append(',');
        sb.append("customFields");
        sb.append('=');
        sb.append(((this.customFields == null)?"<null>":this.customFields));
        sb.append(',');
        sb.append("customFieldOptions");
        sb.append('=');
        sb.append(((this.customFieldOptions == null)?"<null>":this.customFieldOptions));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("lists");
        sb.append('=');
        sb.append(((this.lists == null)?"<null>":this.lists));
        sb.append(',');
        sb.append("stickers");
        sb.append('=');
        sb.append(((this.stickers == null)?"<null>":this.stickers));
        sb.append(',');
        sb.append("reactions");
        sb.append('=');
        sb.append(((this.reactions == null)?"<null>":this.reactions));
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
        result = ((result* 31)+((this.attachments == null)? 0 :this.attachments.hashCode()));
        result = ((result* 31)+((this.cards == null)? 0 :this.cards.hashCode()));
        result = ((result* 31)+((this.customFieldOptions == null)? 0 :this.customFieldOptions.hashCode()));
        result = ((result* 31)+((this.customFields == null)? 0 :this.customFields.hashCode()));
        result = ((result* 31)+((this.lists == null)? 0 :this.lists.hashCode()));
        result = ((result* 31)+((this.boards == null)? 0 :this.boards.hashCode()));
        result = ((result* 31)+((this.stickers == null)? 0 :this.stickers.hashCode()));
        result = ((result* 31)+((this.reactions == null)? 0 :this.reactions.hashCode()));
        result = ((result* 31)+((this.checkItems == null)? 0 :this.checkItems.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Limits) == false) {
            return false;
        }
        Limits rhs = ((Limits) other);
        return ((((((((((((this.checklists == rhs.checklists)||((this.checklists!= null)&&this.checklists.equals(rhs.checklists)))&&((this.attachments == rhs.attachments)||((this.attachments!= null)&&this.attachments.equals(rhs.attachments))))&&((this.cards == rhs.cards)||((this.cards!= null)&&this.cards.equals(rhs.cards))))&&((this.customFieldOptions == rhs.customFieldOptions)||((this.customFieldOptions!= null)&&this.customFieldOptions.equals(rhs.customFieldOptions))))&&((this.customFields == rhs.customFields)||((this.customFields!= null)&&this.customFields.equals(rhs.customFields))))&&((this.lists == rhs.lists)||((this.lists!= null)&&this.lists.equals(rhs.lists))))&&((this.boards == rhs.boards)||((this.boards!= null)&&this.boards.equals(rhs.boards))))&&((this.stickers == rhs.stickers)||((this.stickers!= null)&&this.stickers.equals(rhs.stickers))))&&((this.reactions == rhs.reactions)||((this.reactions!= null)&&this.reactions.equals(rhs.reactions))))&&((this.checkItems == rhs.checkItems)||((this.checkItems!= null)&&this.checkItems.equals(rhs.checkItems))))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))));
    }

}
