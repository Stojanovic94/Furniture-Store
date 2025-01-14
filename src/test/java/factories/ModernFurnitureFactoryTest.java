package factories;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import concrete.ModernChair;
import concrete.ModernSofa;
import concrete.ModernTable;

public class ModernFurnitureFactoryTest {
    @Test
    void testCreateChair() {
        ModernFurnitureFactory factory = new ModernFurnitureFactory();
        assertTrue(factory.createChair() instanceof ModernChair);
    }

    @Test
    void testCreateSofa() {
        ModernFurnitureFactory factory = new ModernFurnitureFactory();
        assertTrue(factory.createSofa() instanceof ModernSofa);
    }

    @Test
    void testCreateTable() {
        ModernFurnitureFactory factory = new ModernFurnitureFactory();
        assertTrue(factory.createTable() instanceof ModernTable);
    }
}
