package concrete;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import interfaces.Chair;
import org.junit.jupiter.api.Test;

public class VictorianChairTest {
    @Test
    void testVictorianChairInitialization() {
        Chair victorianChair = new VictorianChair();
        assertNotNull(victorianChair, "VictorianChair objekat ne bi trebalo da bude null.");
    }

    @Test
    void testVictorianChairInstance() {
        Chair victorianChair = new VictorianChair();
        assertTrue(victorianChair instanceof VictorianChair, "VictorianChair objekat nije odgovarajućeg tipa.");
    }
}
