package ex_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API_TESTING_008_BDD_STYLE {
    //BDD Style
    @Test
    public void test_Get_positive()
    {
        String Pincode ="560058";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
