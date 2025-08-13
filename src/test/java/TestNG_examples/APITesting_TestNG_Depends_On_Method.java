package TestNG_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_TestNG_Depends_On_Method
{
    @Test
    public void ServerStartedOk()
    {
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "ServerStartedOk" )
    public void test_01()
    {
        System.out.println("Method1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "ServerStartedOk" )
    public void test_02()
    {
        System.out.println("Method2");
        Assert.assertTrue(true);
    }

}
