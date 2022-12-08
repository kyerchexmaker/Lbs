package ru.tpu.lab.lb5;

public abstract class Transistor implements Component{
    public abstract String getInfo();
    public String getDiscription() {
        return "Транзистор: ";
    }
}
