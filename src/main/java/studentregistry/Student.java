package studentregistry;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String dob;
    private int age;
    private int ID;
    private String username;

    private List<Module> modules = new ArrayList<Module>();
    private CourseProgramme course;

    public Student(String name, String dob, int ID) {
        this.name = name;
        this.dob = dob;
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/mm/yyyy");
        DateTime dt = formatter.parseDateTime(this.dob);
        Years Age =  Years.yearsBetween(dt, new DateTime());
        return Age.getYears();
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() { return this.dob; }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return this.ID;
    }

    public String getUsername() {
        return this.name + getAge();
    }

    public void setModules(List<Module> modules) { this.modules = modules; }

    public List<Module> getModules() { return this.modules; }

    public void addModule(Module module) { this.modules.add(module); }

    public void setCourse(CourseProgramme c) { this.course = c; }

    public CourseProgramme getCourse() { return this.course; }

}
