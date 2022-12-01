import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.hamcrest.core.IsEqual;

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
    @DisplayName("Teste Busca")
    void testSearch(){

        given()
            .when().get("/manga/search/db")
            .then()
                .statusCode(200);

    }

    @Test
    @DisplayName("Teste 3")
    void testError(){

        given()
            .when().get("/manga/db")
            .then()
                .statusCode(404);

    }

    @Test
    @DisplayName("Teste 3")
    void testAPI(){

        given()
            .when().get("/manga/search/128991")
            .then()
           // .body("data.mal_id[0]", is("133666"));
            .body(is(null));

    }

}
