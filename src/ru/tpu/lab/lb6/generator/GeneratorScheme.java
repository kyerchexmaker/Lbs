package ru.tpu.lab.lb6.generator;

import ru.tpu.lab.lb6.Chip;
import ru.tpu.lab.lb6.Diode;
import ru.tpu.lab.lb6.SchemeGenerator;
import ru.tpu.lab.lb6.Transistor;

public class GeneratorScheme implements SchemeGenerator {
    @Override
    public Diode getDiode() {
        return new Varicap();
    }

    @Override
    public Transistor getTransistor() {
        return new BJT();
    }

    @Override
    public Chip getChip() {
        return new PLL();
    }
}
