package ex_04_RestAssured_HTTP_Methods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_TESTING_13_PATCH_NON_BDD_STYLE
{

    RequestSpecification r;
    Response response;  // then also we can imagine
    ValidatableResponse validatableResponse; // when also we can imagine

    @Test
    public void test_NON_BDD()
    {
        String token = "7131a0442e49fe0";
        String booking_id = "3982";
        String payload_patch= "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification. baseUri("https://restful-booker.herokuapp.com/booking");
        requestSpecification.basePath("/booking/" + booking_id);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("/token" + token);

        requestSpecification.body(payload_patch).log().all();
        Response response1 = requestSpecification.when().patch();

        ValidatableResponse validatableResponse1 = response1.then().log().all();
        validatableResponse1.statusCode(200);
    }
}
