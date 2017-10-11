package studentregistry;

import java.util.ArrayList;
import java.util.List;

public class Module {

    private String name;
    private String ID;
    private List<Student> students;
    private List<CourseProgramme> courses = new ArrayList<CourseProgramme>();

    public Module(String name, String ID, List<Student> students ) {
        this.name = name;
        this.ID = ID;
        this.students = students;

        for (Student s: students) {
            s.addModule(this);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return this.ID;
    }

    public void setStudents(List<Student> students) { this.students = students; }

    public List<Student> getStudents() { return this.students; }

    public void addStudent(Student s) { this.students.add(s); }

    public void setCourses(List<CourseProgramme> courses) { this.courses = courses; }

    public List<CourseProgramme> getCourses() { return this.courses; }

    public void addCourse(CourseProgramme course) { this.courses.add(course); }

}
