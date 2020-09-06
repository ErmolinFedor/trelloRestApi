
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class List__1 {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("pos")
    @Expose
    private Integer pos;
    @SerializedName("softLimit")
    @Expose
    private Object softLimit;
    @SerializedName("creationMethod")
    @Expose
    private String creationMethod;
    @SerializedName("idBoard")
    @Expose
    private String idBoard;
    @SerializedName("limits")
    @Expose
    private Limits__3 limits;
    @SerializedName("subscribed")
    @Expose
    private Boolean subscribed;

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

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Object getSoftLimit() {
        return softLimit;
    }

    public void setSoftLimit(Object softLimit) {
        this.softLimit = softLimit;
    }

    public String getCreationMethod() {
        return creationMethod;
    }

    public void setCreationMethod(String creationMethod) {
        this.creationMethod = creationMethod;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public Limits__3 getLimits() {
        return limits;
    }

    public void setLimits(Limits__3 limits) {
        this.limits = limits;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(List__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("closed");
        sb.append('=');
        sb.append(((this.closed == null)?"<null>":this.closed));
        sb.append(',');
        sb.append("pos");
        sb.append('=');
        sb.append(((this.pos == null)?"<null>":this.pos));
        sb.append(',');
        sb.append("softLimit");
        sb.append('=');
        sb.append(((this.softLimit == null)?"<null>":this.softLimit));
        sb.append(',');
        sb.append("creationMethod");
        sb.append('=');
        sb.append(((this.creationMethod == null)?"<null>":this.creationMethod));
        sb.append(',');
        sb.append("idBoard");
        sb.append('=');
        sb.append(((this.idBoard == null)?"<null>":this.idBoard));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
        sb.append(',');
        sb.append("subscribed");
        sb.append('=');
        sb.append(((this.subscribed == null)?"<null>":this.subscribed));
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
        result = ((result* 31)+((this.subscribed == null)? 0 :this.subscribed.hashCode()));
        result = ((result* 31)+((this.idBoard == null)? 0 :this.idBoard.hashCode()));
        result = ((result* 31)+((this.pos == null)? 0 :this.pos.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.closed == null)? 0 :this.closed.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
        result = ((result* 31)+((this.softLimit == null)? 0 :this.softLimit.hashCode()));
        result = ((result* 31)+((this.creationMethod == null)? 0 :this.creationMethod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof List__1) == false) {
            return false;
        }
        List__1 rhs = ((List__1) other);
        return ((((((((((this.subscribed == rhs.subscribed)||((this.subscribed!= null)&&this.subscribed.equals(rhs.subscribed)))&&((this.idBoard == rhs.idBoard)||((this.idBoard!= null)&&this.idBoard.equals(rhs.idBoard))))&&((this.pos == rhs.pos)||((this.pos!= null)&&this.pos.equals(rhs.pos))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.closed == rhs.closed)||((this.closed!= null)&&this.closed.equals(rhs.closed))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))))&&((this.softLimit == rhs.softLimit)||((this.softLimit!= null)&&this.softLimit.equals(rhs.softLimit))))&&((this.creationMethod == rhs.creationMethod)||((this.creationMethod!= null)&&this.creationMethod.equals(rhs.creationMethod))));
    }

}
