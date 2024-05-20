package io.callumh.javaexperiments.ollama;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ollama")
public class OllamaController {

    @GetMapping("/test")
    public String performRequest() {
        return "Banana";
    }

}
