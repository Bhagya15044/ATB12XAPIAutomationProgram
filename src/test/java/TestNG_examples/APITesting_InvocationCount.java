package TestNG_examples;

import org.testng.annotations.Test;

public class APITesting_InvocationCount
{
    @Test(invocationCount = 3)
    public void test()
    {
        System.out.println("Hi");
    }

    @Test(invocationCount = 2)
    public void test01()
    {
        System.out.println("Bye");
    }
}
