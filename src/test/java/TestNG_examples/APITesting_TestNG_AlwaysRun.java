package TestNG_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_TestNG_AlwaysRun
{
    @Test
    public void loginPage()
    {
        Assert.assertTrue(true);
    }
    @Test(alwaysRun = true )
    public void MenuBar()
    {
        Assert.assertTrue(true);
    }
    @Test
    public void CloseThePage()
    {
        Assert.assertTrue(true);
    }
}
