package studentregistry;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Student {

    private String name;
    private String dob;
    private int age = 0;
    private int ID = 0;
    private String username;

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

}
