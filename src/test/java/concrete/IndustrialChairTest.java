package concrete;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import interfaces.Chair;
import org.junit.jupiter.api.Test;

public class IndustrialChairTest {
    @Test
    void testIndustrialChairInitialization() {
        Chair industrialChair = new IndustrialChair();
        assertNotNull(industrialChair, "IndustrialChair objekat ne bi trebalo da bude null.");
    }

    @Test
    void testIndustrialChairInstance() {
        Chair industrialChair = new IndustrialChair();
        assertTrue(industrialChair instanceof IndustrialChair, "IndustrialChair objekat nije odgovarajućeg tipa.");
    }
}
