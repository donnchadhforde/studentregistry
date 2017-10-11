import org.junit.*;
import studentregistry.Student;

import static org.junit.Assert.assertEquals;

public class JUnitTest {

    Student stu;

    public JUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        stu = new Student("Philip", "28/08/1992", 51684);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testUsername() {
        String trueUsername = "Philip25";
        String testUsername = stu.getUsername();
        assertEquals(trueUsername, testUsername);
    }
}