
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Old {

    @SerializedName("prefs")
    @Expose
    private Prefs__1 prefs;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("dueComplete")
    @Expose
    private Boolean dueComplete;
    @SerializedName("due")
    @Expose
    private Object due;
    @SerializedName("dueReminder")
    @Expose
    private Object dueReminder;
    @SerializedName("desc")
    @Expose
    private String desc;

    public Prefs__1 getPrefs() {
        return prefs;
    }

    public void setPrefs(Prefs__1 prefs) {
        this.prefs = prefs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDueComplete() {
        return dueComplete;
    }

    public void setDueComplete(Boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    public Object getDue() {
        return due;
    }

    public void setDue(Object due) {
        this.due = due;
    }

    public Object getDueReminder() {
        return dueReminder;
    }

    public void setDueReminder(Object dueReminder) {
        this.dueReminder = dueReminder;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Old.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("prefs");
        sb.append('=');
        sb.append(((this.prefs == null)?"<null>":this.prefs));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("dueComplete");
        sb.append('=');
        sb.append(((this.dueComplete == null)?"<null>":this.dueComplete));
        sb.append(',');
        sb.append("due");
        sb.append('=');
        sb.append(((this.due == null)?"<null>":this.due));
        sb.append(',');
        sb.append("dueReminder");
        sb.append('=');
        sb.append(((this.dueReminder == null)?"<null>":this.dueReminder));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.dueReminder == null)? 0 :this.dueReminder.hashCode()));
        result = ((result* 31)+((this.due == null)? 0 :this.due.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.dueComplete == null)? 0 :this.dueComplete.hashCode()));
        result = ((result* 31)+((this.prefs == null)? 0 :this.prefs.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Old) == false) {
            return false;
        }
        Old rhs = ((Old) other);
        return (((((((this.dueReminder == rhs.dueReminder)||((this.dueReminder!= null)&&this.dueReminder.equals(rhs.dueReminder)))&&((this.due == rhs.due)||((this.due!= null)&&this.due.equals(rhs.due))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.dueComplete == rhs.dueComplete)||((this.dueComplete!= null)&&this.dueComplete.equals(rhs.dueComplete))))&&((this.prefs == rhs.prefs)||((this.prefs!= null)&&this.prefs.equals(rhs.prefs))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
