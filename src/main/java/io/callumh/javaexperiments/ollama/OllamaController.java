package io.callumh.javaexperiments.ollama;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ollama")
@RequiredArgsConstructor
public class OllamaController {

    private final ChatClient chatClient;

    @GetMapping("/chat")
    public AssistantMessage chat(@RequestParam("prompt") final String prompt) {
        return chatClient.call(new Prompt(prompt)).getResult().getOutput();
    }

}
