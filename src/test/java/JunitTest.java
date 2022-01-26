import org.junit.*;

public class JunitTest {

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("BeforeClass");
    }

    @Before
    public void beforeTest() {
        System.out.println("Before");
    }

    @Test
    public void testTest() {
        System.out.println("Test");
    }

    @After
    public void afterTest() {
        System.out.println("After");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("After Class");
    }
}
