package fact;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fact {
    private final String id; // - уникальный идентификатор записи
    private final String text; // - сообщение
    private final String type; // - тип животного
    private final String user; // - имя пользователя
    private final Integer upvotes; // - голоса

    public Fact(
            @JsonProperty("id")String id,
            @JsonProperty("text")String text,
            @JsonProperty("type")String type,
            @JsonProperty("user")String user,
            @JsonProperty("upvotes")Integer upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\tid='" + id + '\n' +
                "\ttext='" + text + '\n' +
                "\ttype='" + type + '\n' +
                "\tuser='" + user + '\n' +
                "\tupvotes='" + upvotes + '\n' +
                '}';
    }
}
