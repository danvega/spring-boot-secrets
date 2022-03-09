package dev.danvega.secrets;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(NotionController.class)
class NotionControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void printAllProps() {
        Map<String,String> response = webTestClient
                .get()
                .uri("/notion")
                .exchange()
                .expectStatus().isOk()
                .expectBody(Map.class)
                .returnResult()
                .getResponseBody();

        assertEquals("https://api.notion.com",response.get("apiUrl"));
        assertEquals("2021-08-16",response.get("apiVersion"));
        assertEquals("secret_1234",response.get("authToken"));
        assertEquals("9090909090",response.get("databaseId"));
    }
}