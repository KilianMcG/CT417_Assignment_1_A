import java.util.ArrayList;

public class Module {
    private String mName;
    private String mID;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String name, String ID) {
        mName = name;
        mID = ID;

        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void setName(String newName) {
        mName = newName;
    }

    public String getName() {
        return mName;
    }

    public void setID(String newID) {
        mID = newID;
    }

    public String getID() {
        return mID;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public void addCourse(Course newCourse) {
        courses.add(newCourse);
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }
}
