package com.nwhite.book.recomendation;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    private final ChatClient chatClient;

    public BookController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/")
    public String home() {
        return chatClient.prompt()
                .user("Generate a book recommendation for a book on AI and coding")
                .call()
                .content();
    }
}
