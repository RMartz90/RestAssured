package main.RestAssured1;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class pokemon {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/"; // Replace with your API base URL
    }

    @Test
    public void testGetRequest() {
        given().relaxedHTTPSValidation().when()
                .get("/pokemon/pikachu")
                .then()
                .statusCode(200)
                .body("name", equalTo("pikachu"))
                .body("order", equalTo(35))
        ; // Example assertion
    }

}
