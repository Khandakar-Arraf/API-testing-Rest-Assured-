package fake_api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class api_test_cases extends BaseTest {

    @Test (priority = 1)
    public void getRequestShouldSucceed() { // get posts

        given()
                .spec(getRequestSpecification())
                .log().uri()
                .when()
                .get("/posts")
                .then()
                .log().body()
                .statusCode(200);
    }

    @Test(priority = 2)
    public void getRequestDetailShouldSucceed() { // get comments

        given()
                .spec(getRequestSpecification())
                .log().uri()
                .when()
                .get("/comments")
                .then()
                .log().body()
                .statusCode(200);
    }

}
