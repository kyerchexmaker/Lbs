package ru.tpu.lab.lb3;

public class Zener extends Diode{
    double Ustab;

    public Zener(double Ustab, Component component) {
        super(component);
        this.Ustab = Ustab;
    }



    double getStabilizationVoltage(){
        return Ustab;
    }

    public String ZenerDescription(){
        return " Работает в режиме пробоя. Напряжение стабилизации: " + getStabilizationVoltage();
    }

    @Override
    public String DiodePurpose() {
        return super.DiodePurpose() + ZenerDescription();
    }
}

