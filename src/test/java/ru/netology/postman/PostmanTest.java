
package ru.netology.postman;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class PostmanTest {
    @Test
    void postText() {
        var text = "Hello";

        given()

                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body(text)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }
}
