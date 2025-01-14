package concrete;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import interfaces.Chair;
import org.junit.jupiter.api.Test;

public class ModernChairTest {
    @Test
    void testModernChairInitialization() {
        Chair modernChair = new ModernChair();
        assertNotNull(modernChair, "ModernChair objekat ne bi trebalo da bude null.");
    }

    @Test
    void testModernChairInstance() {
        Chair modernChair = new ModernChair();
        assertTrue(modernChair instanceof ModernChair, "ModernChair objekat nije odgovarajućeg tipa.");
    }
}
