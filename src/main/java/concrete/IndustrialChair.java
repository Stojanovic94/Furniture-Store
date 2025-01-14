package concrete;

import interfaces.Chair;

public class IndustrialChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on an industrial chair.");
    }
}
