package Model;

public class Group {

    private String username;
    private String group;

    public Group() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Group(String username, String group) {
        this.username = username;
        this.group = group;
    }

}
