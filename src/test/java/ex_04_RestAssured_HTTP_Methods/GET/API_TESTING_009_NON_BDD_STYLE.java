package ex_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_TESTING_009_NON_BDD_STYLE
{
    // these 3 are reusable that why we have given in class level.
    RequestSpecification r;
    Response response;  // then also we can imagine
    ValidatableResponse validatableResponse; // when also we can imagine
   @Test
    public void test_NON_BDD_STYLE()
   {
       //given()-->part1
       String pincode = "560057";
       r = RestAssured.given();
       r.baseUri("https://api.zippopotam.us");
       r.basePath("/IN/"+pincode);

       //when-->part2
       response = r.when().log().all().get();
       System.out.println(response.asString());

       //Then --> part3-->validation
       validatableResponse = response.then().log().all();
       validatableResponse.statusCode(200);
   }
}
