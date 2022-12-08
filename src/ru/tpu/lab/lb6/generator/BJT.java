package ru.tpu.lab.lb6.generator;

import ru.tpu.lab.lb6.Transistor;

public class BJT implements Transistor {
    @Override
    public String transistor() {
        return "Биполярный транзистор. 2N3904";
    }
}
