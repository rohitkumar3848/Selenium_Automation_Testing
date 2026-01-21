package testcase;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.sql.Connection;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class TestApi {

    @Test
    public void getData1(){
        RestAssured.baseURI="https://rahulshettyacademy.com";
        given()
                .header("Content-Type","application/json")
                .queryParam("key","qaclick123")
                .queryParam("place_id","e8c102351efbe00ff7f568d8c56eeff8")
                .when()
                .get("/maps/api/place/get/json")
                .then()
                .log()
                .all()
                .assertThat().statusCode(200)
                .assertThat().time(lessThan(5000L))
                .assertThat().header("Content-Type","application/json;charset=UTF-8")
                .assertThat().header("Connection","Keep-Alive")
                .assertThat().body("name",equalTo("Fontline house"));
    }

    @Test
    public void getData2(){

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
                .assertThat().body("name",equalTo("Apple MacBook Pro 16"));
    }


    @Test
    public void postData(){
        String payload = "{\r\n"
                + "\"location\":{\r\n"
                + "\"lat\":-38.383494,\r\n"
                + "\"lng\":33.427362\r\n"
                + "},\r\n"
                + "\"accuracy\":50,\r\n"
                + "\"name\":\"Fontline house\",\r\n"
                + "\"phone_number\":\"(+91)983 893 3937\",\r\n"
                + "\"address\":\"29,side layout,cohen 09\",\r\n"
                + "\"types\":[\r\n"
                + "\"shoe park\",\r\n"
                + "\"shop\"\r\n"
                + "],\r\n"
                + "\"website\":\"http://google.com\",\r\n"
                + "\"language\":\"Frensch_IN\"\r\n"
                + "}";
        RestAssured.baseURI="https://rahulshettyacademy.com";
        given()
                .header("Content-Type", "application/json")
                .queryParam("key", "qaclick123")
                .body(payload)
                .when()
                .post("/maps/api/place/add/json")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .assertThat().body("status", equalTo("OK"));

    }

    @Test
    public void postData2(){
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
                .assertThat().body("name", equalTo("Apple MacBook Pro 16"));
                //.assertThat().body("status", equalTo("OK"));
    }
}
