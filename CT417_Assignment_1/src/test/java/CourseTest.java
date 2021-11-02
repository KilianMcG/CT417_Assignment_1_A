import static org.junit.jupiter.api.Assertions.assertEquals;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

public class CourseTest {

    @Test
    public void testGetName() {
        Course c1 = new Course("ENG", LocalDate.parse("2018-09-21"), LocalDate.parse("2022-06-19"));
        assertEquals("ENG", c1.getName());
    }

    @Test
    public void testGetStart() {
        Course c1 = new Course("ENG", LocalDate.parse("2018-09-21"), LocalDate.parse("2022-06-19"));
        assertEquals(LocalDate.parse("2018-09-21"), c1.getStart());
    }

    @Test
    public void testGetEnd() {
        Course c1 = new Course("ENG", LocalDate.parse("2018-09-21"), LocalDate.parse("2022-06-19"));
        assertEquals(new LocalDate(2022, 06, 19), c1.getEnd());
    }

}
