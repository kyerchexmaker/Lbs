package ru.tpu.lab.lb3;

public class Transistor extends ComponentDecorator {
    double MaxVoltage;

    public Transistor(double MaxVoltage, Component component) {
        super(component);
        this.MaxVoltage = MaxVoltage;
    }

    public Transistor(Component component) {
        super(component);
    }

    public double getMaxVoltage(){
        return MaxVoltage;
    }

    public String TransistorPurpose(){
        return " Транзистор. Изменяет сопротивление по управляющему сигналу. Максимальное напряжение: " + getMaxVoltage() + " В.";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + TransistorPurpose();
    }
}
