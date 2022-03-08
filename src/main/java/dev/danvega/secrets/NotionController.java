package dev.danvega.secrets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notion")
public class NotionController {

    private final NotionConfigProperties notionConfigProperties;

    public NotionController(NotionConfigProperties notionConfigProperties) {
        this.notionConfigProperties = notionConfigProperties;
    }

    @GetMapping
    public void printAllProps() {
        System.out.println(notionConfigProperties.apiUrl());
        System.out.println(notionConfigProperties.apiVersion());
        System.out.println(notionConfigProperties.authToken());
        System.out.println(notionConfigProperties.databaseId());
    }
}
