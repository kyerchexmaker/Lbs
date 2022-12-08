package ru.tpu.lab.lb5;

public class Varistor extends Diode {
    double Capaicty;

    public Varistor(double Capacity) {
        this.Capaicty = Capacity;
    }

    double getCapaicty(){
        return Capaicty;
    }

    @Override
    public String getInfo() {
        return "Варикап. Используется для настройки частотных цепей. Дин. ёмкость: " + getCapaicty() + " ф.";
    }
}

