import junit.framework.TestCase;
import studentregistry.Student;

public class Test extends TestCase{

    Student s1;

    public void setUp() {

        s1 = new Student("Paul", "16/06/1995", 16458);

    }

    public void getUsernameTest() {

        String trueUsername = "Paul22";
        String username = s1.getUsername();
        assertTrue(username.equals(trueUsername));
    }

}
