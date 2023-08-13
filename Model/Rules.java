package Model;

public class Rules {

    private String attribute;
    private String value;

    public Rules(String attribute, String value) {
        this.attribute = attribute;
        this.value = value;
    }

    public Rules() {

    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
