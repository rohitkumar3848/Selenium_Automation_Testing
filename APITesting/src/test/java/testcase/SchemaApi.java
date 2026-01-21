package testcase;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class SchemaApi {

    @Test
    public void postData(){
        String payload = "{\n" +
                "  \"name\": \"Apple MacBook Pro 16\",\n" +
                "  \"data\": {\n" +
                "    \"year\": 2019,\n" +
                "    \"price\": 1849.99,\n" +
                "    \"CPU model\": \"Intel Core i9\",\n" +
                "    \"Hard disk size\": \"1 TB\"\n" +
                "  }\n" +
                "}";


        RestAssured.baseURI="https://api.restful-api.dev";
        given()
                .header("Content-Type","application/json")
                .body(payload)
                .when()
                .post("/objects")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .assertThat().body("name", equalTo("Apple MacBook Pro 16"))
         .assertThat()
                .body(matchesJsonSchemaInClasspath("schema.json"));

        //.assertThat().body("status", equalTo("OK"));
    }

    @Test
    public void getData(){

        RestAssured.baseURI="https://api.restful-api.dev";
        given()
                .header("Content-Type","application/json")
                .pathParam("id",7)
                .when()
                .get("/objects/{id}")
                .then()
                .log()
                .all()
                .assertThat().statusCode(200)
                .assertThat().time(lessThan(5000L))
                .assertThat().header("Content-Type","application/json")
                .assertThat().body("name",equalTo("Apple MacBook Pro 16"))
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schema.json"));

    }
}
