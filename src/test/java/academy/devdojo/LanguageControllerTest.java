package academy.devdojo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.emptyArray;

@QuarkusTest
public class LanguageControllerTest {

    @Test
    public void listShouldReturnArrayOfLanguageWhenRequested() {
        given()
            .when().get("/v1/language")
            .then()
            .statusCode(200)
            .body(not(emptyArray()));
    }

}