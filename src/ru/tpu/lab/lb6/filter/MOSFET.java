package ru.tpu.lab.lb6.filter;

import ru.tpu.lab.lb6.Transistor;

public class MOSFET implements Transistor{
    @Override
    public String transistor() {
        return "MOSFET. AUIRF1010Z";
    }
}
