package TestNG_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class API_Testing_TestNG_Grouping
{
    @Test(groups = {"Sanity","Reg"})
    public void test_SanityRun()
    {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"Reg"})
    public void test_RegRun()
    {
        System.out.println("Reg");
        Assert.assertTrue(false);
    }

    @Test(groups = {"Smoke,Reg"})
    public void test_SmokeRun()
    {
        System.out.println("smoke");
        Assert.assertTrue(false);
    }
}
