package TestNG_examples;

import org.apache.groovy.json.internal.Value;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_TestNG_Parameters
{
    @Parameters("browser")
    @Test
    public void demo01(String Value)
    {
        System.out.println("Hi I am demo");
        System.out.println("you are running the chrome");

        if(Value.equalsIgnoreCase("firefox"))
        {
            System.out.println("Start the firefox");
        }
       if(Value.equalsIgnoreCase("chrome"))
        {
            System.out.println("Start the chrome");
        }
    }
}
