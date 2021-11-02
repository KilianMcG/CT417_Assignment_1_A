import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Course {
    private String cName;
    private ArrayList<Module> modules;
    private ArrayList<Student> enrolledStudents;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String name, LocalDate start, LocalDate end) {
        cName = name;
        startDate = start;
        endDate = end;

        enrolledStudents = new ArrayList<>();
        modules = new ArrayList<>();
    }

    public void setName(String newName) {
        cName = newName;
    }

    public String getName() {
        return cName;
    }

    public void setStart(LocalDate newStart) {
        startDate = newStart;
    }

    public LocalDate getStart() {
        return startDate;
    }

    public void setEnd(LocalDate newEnd) {
        endDate = newEnd;
    }

    public LocalDate getEnd() {
        return endDate;
    }

    public void addStudent(Student newStudent) {
        enrolledStudents.add(newStudent);
    }

    public ArrayList<Student> getStudents() {
        return enrolledStudents;
    }

    public void addModule(Module newMod) {
        modules.add(newMod);
    }

    public ArrayList<Module> getModule() {
        return modules;
    }
}
