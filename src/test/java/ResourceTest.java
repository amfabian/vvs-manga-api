import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ResourceTest {
    
    @Test
    @DisplayName("Teste 1")
    void test(){

        given()
            .when().get()
            .then()
                .statusCode(200);

    }
    @Test
    @DisplayName("Teste 2")
    void testErrorPath(){

        given()
            .when().get("/manga")
            .then()
                .statusCode(404);

    }

    @Test
    @DisplayName("Teste 3")
    void testError(){

        given()
            .when().get("/manga/search/db")
            .then()
                .statusCode(200);

    }

}
