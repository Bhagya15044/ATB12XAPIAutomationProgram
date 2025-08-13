package ex_04_RestAssured_HTTP_Methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class API_TESTING_13_DELETE_NON_BDD_STYLE {

    String token = "7131a0442e49fe0";
    String booking_id = "3982";

    {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/booking");
        requestSpecification.basePath("/" + booking_id);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);

        Response response1 = requestSpecification.when().delete();
        ValidatableResponse validatableResponse1 = response1.then().log().all();
        validatableResponse1.statusCode(200);
    }
}
