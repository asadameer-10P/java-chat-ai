package org.example.chatbot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatbotController {

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        return "You said: " + message + ". How can I help you?";
    }
}