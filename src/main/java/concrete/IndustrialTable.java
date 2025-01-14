package concrete;

import interfaces.Table;

public class IndustrialTable implements Table {
    @Override
    public void use() {
        System.out.println("Using an industrial table.");
    }
}
