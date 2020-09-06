
package trello.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomFieldOptions {

    @SerializedName("perField")
    @Expose
    private PerField perField;

    public PerField getPerField() {
        return perField;
    }

    public void setPerField(PerField perField) {
        this.perField = perField;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomFieldOptions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("perField");
        sb.append('=');
        sb.append(((this.perField == null)?"<null>":this.perField));
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
        result = ((result* 31)+((this.perField == null)? 0 :this.perField.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomFieldOptions) == false) {
            return false;
        }
        CustomFieldOptions rhs = ((CustomFieldOptions) other);
        return ((this.perField == rhs.perField)||((this.perField!= null)&&this.perField.equals(rhs.perField)));
    }

}
