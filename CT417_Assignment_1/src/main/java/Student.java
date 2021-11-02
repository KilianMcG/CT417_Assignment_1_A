import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private long ID;
    private LocalDate DOB;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Student(String name, long ID, LocalDate DOB){
        this.name = name;
        this.ID = ID;
        this.DOB = DOB;
        this.age = Years.yearsBetween(DOB, new LocalDate()).getYears();

        courses = new ArrayList<Course>();
        modules = new ArrayList<Module>();

        //getUsername();
    }

    public void getUsername() {
        username = name + age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setID(long newID) {
        ID = newID;
    }

    public long getID() {
        return ID;
    }

    public String getUName() {
        return username;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void addCourse(Course newCourse) {
        courses.add(newCourse);
    }

    public void addModule(Module newModule) {
        modules.add(newModule);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

}
