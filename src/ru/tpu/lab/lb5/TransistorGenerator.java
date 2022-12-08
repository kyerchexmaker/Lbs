package ru.tpu.lab.lb5;

import java.util.Random;

public class TransistorGenerator implements ComponentGenerator {
    private Random random = new Random();
    @Override
    public Component createComponent(String Type) {
        Transistor transistor = null;
        switch (Type){
            case "MOSFET":
                transistor = new MOSFET(random.nextDouble(1000));
                break;
            case "BJT":
                transistor = new BJT(random.nextDouble(80));
                break;
        }
        return transistor;
    }
}
