package Model;

public class Messages {
    private int id;
    private int conversation_id;
    private int sender_id;
    private String content;
    private String created_at;

    public Messages() {     }

    public Messages(int id, int conversation_id, int sender_id, String content, String created_at) {
        this.id = id;
        this.conversation_id = conversation_id;
        this.sender_id = sender_id;
        this.content = content;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConversation_id() {
        return conversation_id;
    }

    public void setConversation_id(int conversation_id) {
        this.conversation_id = conversation_id;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
