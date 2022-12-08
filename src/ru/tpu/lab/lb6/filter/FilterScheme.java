package ru.tpu.lab.lb6.filter;

import ru.tpu.lab.lb6.Chip;
import ru.tpu.lab.lb6.Diode;
import ru.tpu.lab.lb6.SchemeGenerator;
import ru.tpu.lab.lb6.Transistor;

public class FilterScheme implements SchemeGenerator {
    @Override
    public Diode getDiode() {
        return new Zener();
    }

    @Override
    public Transistor getTransistor() {
        return new MOSFET();
    }

    @Override
    public Chip getChip() {
        return new OperationalAmplifier();
    }
}
