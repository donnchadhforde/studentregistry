package studentregistry;

    import java.util.List;

    import org.joda.time.DateTime;
    import org.joda.time.format.DateTimeFormat;
    import org.joda.time.format.DateTimeFormatter;

public class CourseProgramme {

    private String name;
    private final List<Module> modules;
    private DateTime startD;
    private DateTime endD;

    public CourseProgramme(String name, List<Module> modules, String start, String end) {
        this.name = name;
        this.modules = modules;
        this.startD = stringToDate(start);
        this.endD = stringToDate(end);
    }

    private DateTime stringToDate(String dateTime) {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/mm/yyyy");
        return fmt.parseDateTime(dateTime);
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

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

    public void addModule(Module m) { this.modules.add(m); }

}
