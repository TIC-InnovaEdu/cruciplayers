public class Message {
    private String messageType;
    private String content;

    public Message(String messageType, String content) {
        this.messageType = messageType;
        this.content = content;
    }

    public String getMessageType() {
        return messageType;
    }

    public String getContent() {
        return content;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public void setContent(String content) {
        this.content = content;
    }
}