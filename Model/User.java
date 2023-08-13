package Model;

public class User {

    private String username;
    private String attribute;
    private String op;
    private String value;

    public User(String username, String attribute, String op, String value) {
        this.username = username;
        this.attribute = attribute;
        this.op = op;
        this.value = value;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

}
