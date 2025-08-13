package sample;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;

public class RestAssuredHelloworld
{
    public static void main(String[] args)
    {
        //https://api.postalpincode.in/pincode/560036
        RestAssured .given().baseUri("https://api.postalpincode.in")
                .basePath("pincode/560036")

                .when()
                .get()

                .then().log().all().statusCode(200);
    }
}
