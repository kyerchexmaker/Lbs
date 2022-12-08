package ru.tpu.lab.lb6.filter;

import ru.tpu.lab.lb6.Diode;

public class Zener implements Diode {
    @Override
    public String diode() {
        return "Диод. 1N4742A";
    }
}
