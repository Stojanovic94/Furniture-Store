package factories;

import concrete.ModernChair;
import concrete.ModernSofa;
import concrete.ModernTable;
import interfaces.Chair;
import interfaces.Sofa;
import interfaces.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
