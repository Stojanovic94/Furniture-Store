package factories;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import concrete.IndustrialChair;
import concrete.IndustrialSofa;
import concrete.IndustrialTable;

public class IndustrialFurnitureFactoryTest {
    @Test
    void testCreateChair() {
        IndustrialFurnitureFactory factory = new IndustrialFurnitureFactory();
        assertTrue(factory.createChair() instanceof IndustrialChair);
    }

    @Test
    void testCreateSofa() {
        IndustrialFurnitureFactory factory = new IndustrialFurnitureFactory();
        assertTrue(factory.createSofa() instanceof IndustrialSofa);
    }

    @Test
    void testCreateTable() {
        IndustrialFurnitureFactory factory = new IndustrialFurnitureFactory();
        assertTrue(factory.createTable() instanceof IndustrialTable);
    }
}
