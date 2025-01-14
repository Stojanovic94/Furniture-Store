package client;

import factories.FurnitureFactory;
import interfaces.Chair;
import interfaces.Sofa;
import interfaces.Table;

public class FurnitureStore {
    private final Chair chair;
    private final Sofa sofa;
    private final Table table;

    public FurnitureStore(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.table = factory.createTable();
    }

    public void showFurniture() {
        chair.sitOn();
        sofa.lieOn();
        table.use();
    }
}
