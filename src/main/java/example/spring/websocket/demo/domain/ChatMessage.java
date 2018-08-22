package example.spring.websocket.demo.domain;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    private String name;
    private String contents;

}
