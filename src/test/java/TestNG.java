import org.testng.annotations.*;

public class TestNG {

    @BeforeSuite
    public static void beforeSuiteTest() {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

   @BeforeClass
    public static void beforeClassTest() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public static void beforeMethodTest() {
        System.out.println("BeforeMethod");
    }

    @Test
    public void testTest() {
        System.out.println("Test");
    }

    @AfterMethod
    public static void afterMethodTest() {
        System.out.println("AfterMethod");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass");
    }

    @AfterTest
    public static void afterTest() {
        System.out.println("AfterTest");
    }

    @AfterSuite
    public static void afterSuiteTest() {
        System.out.println("AfterSuite");
    }
}
