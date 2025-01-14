package concrete;

import interfaces.Sofa;

public class IndustrialSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on an industrial sofa.");
    }
}
