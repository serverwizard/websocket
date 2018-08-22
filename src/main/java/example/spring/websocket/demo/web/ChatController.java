package example.spring.websocket.demo.web;

import example.spring.websocket.demo.domain.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("hello")
    @SendTo("/chat/hello")
    public ChatMessage hello(ChatMessage message) {
        return message;
    }

    @MessageMapping("bye")
    @SendTo("/chat/bye")
    public ChatMessage bye(ChatMessage message) {
        return message;
    }

    @MessageMapping("detail")
    @SendTo("/chat/detail")
    public ChatMessage detail(ChatMessage message) {
        return message;
    }
}
