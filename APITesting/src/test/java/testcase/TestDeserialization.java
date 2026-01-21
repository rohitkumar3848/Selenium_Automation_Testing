package testcase;

import io.restassured.RestAssured;
import org.example.ObjectRequest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestDeserialization {

    @Test
    public void getData() {

        RestAssured.baseURI = "https://api.restful-api.dev";

        ObjectRequest response =
                given()
                        .pathParam("id", 7)
                        .when()
                        .get("/objects/{id}")
                        .then()
                        .statusCode(200)
                        .extract()
                        .as(ObjectRequest.class);  // 🔥 Deserialization

        Assert.assertEquals(response.getName(), "Apple MacBook Pro 16");
        Assert.assertEquals(response.getData().getYear(), 2019);
        Assert.assertEquals(response.getData().getHardDiskSize(), "1 TB");
    }

}
