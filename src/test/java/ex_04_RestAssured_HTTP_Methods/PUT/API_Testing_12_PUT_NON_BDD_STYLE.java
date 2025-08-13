package ex_04_RestAssured_HTTP_Methods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_Testing_12_PUT_NON_BDD_STYLE
{
    RequestSpecification r;
    Response response;  // then also we can imagine
    ValidatableResponse validatableResponse; // when also we can imagine

    @Test
    public void test_NON_BDD()
    {
        String token = "7131a0442e49fe0";
        String booking_id = "3982";
        String payload = "{\n" +
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
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/booking");
        r.basePath("/booking/" + booking_id);
        r.contentType(ContentType.JSON);
        r.cookie("/token" + token);

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

    }
}
