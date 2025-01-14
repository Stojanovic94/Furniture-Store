package factories;

import interfaces.Chair;
import interfaces.Sofa;
import interfaces.Table;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
