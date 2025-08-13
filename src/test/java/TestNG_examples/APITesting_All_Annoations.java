package TestNG_examples;

import org.testng.annotations.*;

public class APITesting_All_Annoations
{
    @BeforeSuite
    void test01()
    {
        System.out.println("hi");
    }

    @BeforeTest
    void test02()
    {
        System.out.println("hello");
    }

    @BeforeClass
    void test03()
    {
        System.out.println("hey");
    }
    @BeforeMethod
    void test04()
    {
        System.out.println("hoooooo");
    }
    @Test
    void test05()
    {
        System.out.println("huuuu");
    }
    @AfterMethod
    void test06()
    {
        System.out.println("bye");
    }
    @AfterClass
    void test07()
    {
        System.out.println("byeee");
    }
    @AfterTest
    void test08()
    {
        System.out.println("how");
    }
    @AfterSuite
    void test09()
    {
        System.out.println("you");
    }
}
