package ru.tpu.lab.lb3;

public class VariableCapacitor extends Capacitor{
    double MaxVoltageCapacitor;
    public VariableCapacitor(double MaxVoltageCapacitor, Component component) {
        super(component);
        this.MaxVoltageCapacitor = MaxVoltageCapacitor;
    }

    public String VariableCapacitorDescription(){
        return ". Обладает переменной ёмкостью";
    }

    @Override
    public String CapacitorPurpose() {
        return super.CapacitorPurpose() + VariableCapacitorDescription();
    }
}
