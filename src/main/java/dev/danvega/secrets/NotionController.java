package dev.danvega.secrets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/notion")
public class NotionController {

    private final NotionConfigProperties notionConfig;

    public NotionController(NotionConfigProperties notionConfigProperties) {
        this.notionConfig = notionConfigProperties;
    }

    @GetMapping
    public Map<String,String> printAllProps() {
        return Map.of("apiUrl", notionConfig.apiUrl(),
                "apiVersion", notionConfig.apiUrl(),
                "authToken", notionConfig.authToken(),
                "databaseId", notionConfig.databaseId());
    }
}
