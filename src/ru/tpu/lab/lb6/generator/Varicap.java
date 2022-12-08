package ru.tpu.lab.lb6.generator;

import ru.tpu.lab.lb6.Diode;

public class Varicap implements Diode {
    @Override
    public String diode() {
        return "Варикап. КВ109А";
    }
}
