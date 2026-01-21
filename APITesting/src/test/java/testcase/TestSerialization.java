package testcase;

import io.restassured.RestAssured;
import org.example.DataPojo;
import org.example.ObjectRequest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

public class TestSerialization {

    @Test
    public void postData(){
        DataPojo data = new DataPojo();
        data.setYear(2019);
        data.setPrice(1849.99);
        data.setCpuModel("Intel Core i9");
        data.setHardDiskSize("1 TB");

        ObjectRequest request=new ObjectRequest();
        request.setName("Apple MacBook Pro 16");
        request.setData(data);

        RestAssured.baseURI = "https://api.restful-api.dev";
        ObjectRequest response =
                given()
                        .contentType("application/json") //serialization
                        .body(request)
                        .when()
                        .post("/objects")
                        .then()
                        .log().all()
                        .assertThat().statusCode(200)
                        .assertThat().body("name", equalTo("Apple MacBook Pro 16"))
                        .body(matchesJsonSchemaInClasspath("schema.json"))
                        .extract()                     // 🔹 Extract the response
                        .as(ObjectRequest.class);      // 🔹 Deserialize JSON → POJO

    }
}
