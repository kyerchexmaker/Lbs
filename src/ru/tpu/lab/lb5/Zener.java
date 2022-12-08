package ru.tpu.lab.lb5;

public class Zener extends Diode {
    double Ustab;

    public Zener(double Ustab) {

        this.Ustab = Ustab;
    }

    @Override
    public String getInfo() {
        return "Стабилитрон. Работает в режиме пробоя. Напряжение стабилизации: " + getStabilizationVoltage() + " В.";
    }

    double getStabilizationVoltage(){
        return Ustab;
    }

}

