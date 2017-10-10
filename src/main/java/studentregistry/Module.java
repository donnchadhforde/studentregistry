package studentregistry;

import java.util.List;

public class Module {

    private String name;
    private String ID;
    private final List<Student> students;

    public Module(String name, String ID, List<Student> students ) {
        this.name = name;
        this.ID = ID;
        this.students = students;
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

    public void addStudent(Student s) { this.students.add(s); }

}
