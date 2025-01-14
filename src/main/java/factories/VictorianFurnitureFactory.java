package factories;

import concrete.VictorianChair;
import concrete.VictorianSofa;
import concrete.VictorianTable;
import interfaces.Chair;
import interfaces.Sofa;
import interfaces.Table;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
