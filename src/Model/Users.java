package Model;

public class Users {
    private int id;
    private String username;
    private String password;
    private String display_name;
    private String avatar_url;
    private String created_at;

    public Users() {    }

    public Users(int id, String username, String password, String display_name, String avatar_url, String created_at) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.display_name = display_name;
        this.avatar_url = avatar_url;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
