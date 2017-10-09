import studentregistry.CourseProgramme;
import studentregistry.Module;
import studentregistry.Student;

import java.util.ArrayList;

public class Test {

    public static void main (String[] args) {

        ArrayList stu1, stu2, mod1;
        stu1 = new ArrayList<Student>();
        stu2 = new ArrayList<Student>();
        mod1 = new ArrayList<Module>();

        Student s1 = new Student("John", "16/06/1995", 123456);
        Student s2 = new Student("Paul", "24/09/1986", 654321);
        Student s3 = new Student("Bill", "06/12/1967", 246810);

        stu1.add(s1);
        stu1.add(s2);
        stu2.add(s2);
        stu2.add(s3);

        Module m1 = new Module("Tech", "ee345", stu1);
        Module m2 = new Module("Software", "rt456", stu2);
        m2.addStudent(s1);
        m1.addStudent(s3);

        mod1.add(m1);

        CourseProgramme c1 = new CourseProgramme("Eng", mod1, "01/09/2017", "18-05/2018");
        c1.addModule(m2);

        System.out.println(c1.getEndDate() + m1.getName() + s2.getUsername());
    }
}
