package TestNG_examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class API_Testing_Before_test
{
    /*
         PUT request
         get token
         get booking ID
         test_put
         close All things
     */
    @BeforeTest
    public void getToken()
    {
        System.out.println("Before get token");
    }

    @BeforeTest
    public void getbookingid()
    {
        System.out.println("get booking ID");
    }

    @Test
    public void test_put()
    {
        System.out.println("PUT Request");
    }

    @AfterTest
    public void Close_All_Things()
    {
        System.out.println("Close");
    }
}
