import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class ResourceTest {
    
    @Test
    @DisplayName("Teste 1 - teste que a página inicial do service está funcionando")
    void testHome(){

        given()
            .when().get()
            .then()
                .statusCode(200);

    }
    @Test
    @DisplayName("Teste 2 - Testa Path errado")
    void testErrorPath(){

        given()
            .when().get("/manga")
            .then()
                .statusCode(404);

    }

    @Test
    @DisplayName("Teste 3 Faz uma Busca qualquer na api")
    void testSearch(){

        given()
            .when().get("/manga/search/db")
            .then()
                .statusCode(200);

    }

    @Test
    @DisplayName("Teste 4 FAz uma busca no path errado")
    void testSearchError(){

        given()
            .when().get("/manga/db")
            .then()
                .statusCode(404);

    }

    @Test
    @DisplayName("Teste 5 - Faz busca por isekai na API")
    void testAPI(){

               
        given().when()
        .get("/manga/search/isekai")
            .then()
            .assertThat().body(containsString("128991"));
    }
    @Test
    @DisplayName("Teste 6 - Faz busca por um manga em especifico na API")
    void testAPIJSON(){

        given()
            .when().get("/manga/search/to love ru darkness")
            .then()
            .assertThat().body(containsString("22519"));
    }
}
