package ex_04_RestAssured_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_TESTING_11_POST_NON_BDD_STYLE
{
    RequestSpecification r;
    Response response;  // then also we can imagine
    ValidatableResponse validatableResponse; // when also we can imagine

    @Test
    public void test_post_NON_BDD_STLE_Create_Token()
    {
        String Payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        System.out.println("---part---");
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(Payload)
                .when().log().all().post()
                .then().log().all().statusCode(200);

        //Making Http request part 2
        response = r.when().log().all().post();
        System.out.println(response.asString());

        //Then --> part3-->validation
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
    }
    }

