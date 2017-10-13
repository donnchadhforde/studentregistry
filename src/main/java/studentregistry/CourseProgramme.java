package studentregistry;

    import java.util.ArrayList;
    import java.util.List;

    import org.joda.time.DateTime;
    import org.joda.time.format.DateTimeFormat;
    import org.joda.time.format.DateTimeFormatter;

public class CourseProgramme {

    private String name;
    private List<Module> modules;
    private List<Student> students = new ArrayList<Student>();
    private DateTime startD;
    private DateTime endD;

    public CourseProgramme(String name, List<Module> modules, String start, String end) {
        this.name = name;
        this.modules = modules;
        this.startD = stringToDate(start);
        this.endD = stringToDate(end);

        for (Module m: modules) {
            m.addCourse(this);

            for (Student s: m.getStudents()) {

                if (s.getCourse() == null) {

                    if (modules.equals(s.getModules())) {
                        s.setCourse(this);
                        addStudent(s);
                    }
                }
            }
        }
    }

    private DateTime stringToDate(String dateTime) {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/mm/yyyy");
        return fmt.parseDateTime(dateTime);
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public void setModules(List<Module> modules) {this.modules = modules; }

    public List<Module> getModules() { return this.modules; }

    public void setStartDate(String start) {
        this.startD = stringToDate(start);
    }

    public String getStartDate() {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/mm/yyyy");
        return fmt.print(this.startD);
    }

    public void setEndDate(String end) {
        this.endD = stringToDate(end);
    }

    public String getEndDate() {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/mm/yyyy");
        return fmt.print(this.endD);
    }

    public void setStudents(List<Student> students) { this.students = students; }

    public List<Student> getStudents() { return this.students; }

    public void addStudent(Student s) { this.students.add(s); }

}
