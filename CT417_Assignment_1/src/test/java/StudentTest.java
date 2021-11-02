import static org.junit.jupiter.api.Assertions.assertEquals;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testAgeAndUsername() {
        Student s1 = new Student("Tom", 123456, LocalDate.parse("2000-03-14"));
        assertEquals(21, s1.getAge());
        s1.getUsername();
        assertEquals("Tom21", s1.getUName());
    }

    @Test
    public void testAddCourse() {
        Student s1 = new Student("Tom", 123456, LocalDate.parse("2000-03-14"));
        s1.addCourse(new Course("ENG", LocalDate.parse("2018-09-21"), LocalDate.parse("2022-06-19")));
        s1.addCourse(new Course("CS", LocalDate.parse("2018-09-21"), LocalDate.parse("2022-06-19")));
        s1.addCourse(new Course("ENG", LocalDate.parse("2021-09-21"), LocalDate.parse("2025-06-24")));

        assertEquals(new LocalDate(2018, 9, 21), s1.getCourses().get(0).getStart());
        assertEquals("CS", s1.getCourses().get(1).getName());
        assertEquals(new LocalDate(2025, 6, 24), s1.getCourses().get(2).getEnd());

    }

    @Test
    public void testAddModule() {
        Student s1 = new Student("Tom", 123456, LocalDate.parse("2000-03-14"));
        s1.addModule(new Module("Software Engineering III", "CT417"));
        s1.addModule(new Module("System on Chip Design II", "EE452"));

        assertEquals("Software Engineering III", s1.getModules().get(0).getName());
        assertEquals("EE452", s1.getModules().get(1).getID());
    }

}
