package ru.tpu.lab.lb6;

public interface SchemeGenerator {
    public Diode getDiode();
    public Transistor getTransistor();
    public Chip getChip();
}
