package concrete;

import interfaces.Table;

public class VictorianTable implements Table {
    @Override
    public void use() {
        System.out.println("Using a Victorian table.");
    }
}
