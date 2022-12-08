package ru.tpu.lab.lb5;

public abstract class Diode implements Component {
    public abstract String getInfo();
    public String getDiscription() {
        return "Диод: ";
    }
}
