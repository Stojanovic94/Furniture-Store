package factories;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import concrete.VictorianChair;
import concrete.VictorianSofa;
import concrete.VictorianTable;

public class VictorianFurnitureFactoryTest {
    @Test
    void testCreateChair() {
        VictorianFurnitureFactory factory = new VictorianFurnitureFactory();
        assertTrue(factory.createChair() instanceof VictorianChair);
    }

    @Test
    void testCreateSofa() {
        VictorianFurnitureFactory factory = new VictorianFurnitureFactory();
        assertTrue(factory.createSofa() instanceof VictorianSofa);
    }

    @Test
    void testCreateTable() {
        VictorianFurnitureFactory factory = new VictorianFurnitureFactory();
        assertTrue(factory.createTable() instanceof VictorianTable);
    }
}
