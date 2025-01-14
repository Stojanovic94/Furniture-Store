package concrete;

import interfaces.Table;

public class ModernTable implements Table {
    @Override
    public void use() {
        System.out.println("Using a modern table.");
    }
}
