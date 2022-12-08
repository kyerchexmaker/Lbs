package ru.tpu.lab.lb5;

import java.util.Random;

public class DiodeGenerator implements ComponentGenerator {
    private Random random = new Random();

    @Override
    public Component createComponent(String Type) {
        Diode diode = null;
        switch (Type) {
            case "Varistor":
                diode = new Varistor(random.nextDouble(300));
                break;
            case "Zener":
                diode = new Zener(random.nextDouble(100));
                break;
        }
        return diode;
    }
}
