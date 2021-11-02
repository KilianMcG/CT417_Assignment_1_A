import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ModuleTest {

    @Test
    public void testGetName() {
        Module m1 = new Module("Software Engineering III", "CT417");
        assertEquals("Software Engineering III", m1.getName());
    }

    @Test
    public void testGetID() {
        Module m1 = new Module("Software Engineering III", "CT417");
        assertEquals("CT417", m1.getID());
    }

}
