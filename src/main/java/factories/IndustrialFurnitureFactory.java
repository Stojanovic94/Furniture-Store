package factories;

import concrete.IndustrialChair;
import concrete.IndustrialSofa;
import concrete.IndustrialTable;
import interfaces.Chair;
import interfaces.Sofa;
import interfaces.Table;

public class IndustrialFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new IndustrialChair();
    }

    @Override
    public Sofa createSofa() {
        return new IndustrialSofa();
    }

    @Override
    public Table createTable() {
        return new IndustrialTable();
    }
}
