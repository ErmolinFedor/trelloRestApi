
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Action {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("idMemberCreator")
    @Expose
    private String idMemberCreator;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("limits")
    @Expose
    private Limits__1 limits;
    @SerializedName("memberCreator")
    @Expose
    private MemberCreator memberCreator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMemberCreator() {
        return idMemberCreator;
    }

    public void setIdMemberCreator(String idMemberCreator) {
        this.idMemberCreator = idMemberCreator;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Limits__1 getLimits() {
        return limits;
    }

    public void setLimits(Limits__1 limits) {
        this.limits = limits;
    }

    public MemberCreator getMemberCreator() {
        return memberCreator;
    }

    public void setMemberCreator(MemberCreator memberCreator) {
        this.memberCreator = memberCreator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Action.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("idMemberCreator");
        sb.append('=');
        sb.append(((this.idMemberCreator == null)?"<null>":this.idMemberCreator));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
        sb.append(',');
        sb.append("memberCreator");
        sb.append('=');
        sb.append(((this.memberCreator == null)?"<null>":this.memberCreator));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.memberCreator == null)? 0 :this.memberCreator.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.idMemberCreator == null)? 0 :this.idMemberCreator.hashCode()));
        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Action) == false) {
            return false;
        }
        Action rhs = ((Action) other);
        return ((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.memberCreator == rhs.memberCreator)||((this.memberCreator!= null)&&this.memberCreator.equals(rhs.memberCreator))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.idMemberCreator == rhs.idMemberCreator)||((this.idMemberCreator!= null)&&this.idMemberCreator.equals(rhs.idMemberCreator))))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))));
    }

}
