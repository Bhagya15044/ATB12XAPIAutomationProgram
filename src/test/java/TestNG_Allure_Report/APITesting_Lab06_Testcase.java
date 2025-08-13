package TestNG_Allure_Report;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_Testcase
{
        @Test
         public void test_GET_POSITIVE_TC1()
        {
            String pincode = "110048";
            RestAssured
                    .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/"+pincode)
                    .when()
                    .get()
                    .then()
                    .log().all().statusCode(200);
        }

        @Test
        public void test_GET_NEGATIVE_TC2()
        {
          String  pincode  = " ";
            RestAssured
                    .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/USA/"+pincode)
                    .when()
                    .get()
                    .then()
                    .log().all().statusCode(200);
        }
}
