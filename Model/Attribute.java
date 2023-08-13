package Model;

public class Attribute {

    private String groupname;
    private String attribute;
    private String op;
    private String value;

    public Attribute() {

    }

    public Attribute(String attribute, String value) {
        this.attribute = attribute;
        this.value = value;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String username) {
        this.groupname = username;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Attribute(String username, String attribute, String op, String value) {
        this.groupname = username;
        this.attribute = attribute;
        this.op = op;
        this.value = value;
    }

}
