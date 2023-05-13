package Model;

public class Conversations {
    private int id;
    private String name;
    private int created_by;
    private String created_at;

    public Conversations() {    }

    public Conversations(int id, String name, int created_by, String created_at) {
        this.id = id;
        this.name = name;
        this.created_by = created_by;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
