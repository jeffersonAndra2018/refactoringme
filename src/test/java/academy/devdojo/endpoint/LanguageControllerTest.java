package academy.devdojo.endpoint;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.emptyArray;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class LanguageControllerTest {

    @Test
    void listShouldReturnArrayOfLanguageWhenRequestedWithParameters() {
        given()
            .when().get("/v1/language?startPage=1&pageSize=5")
            .then()
            .statusCode(200)
            .body(not(emptyArray()));
    }

    @Test
    void listShouldReturnArrayOfLanguageWhenRequestedWithoutParameters() {
        given()
            .when().get("/v1/language")
            .then()
            .statusCode(200)
            .body(not(emptyArray()));
    }

}