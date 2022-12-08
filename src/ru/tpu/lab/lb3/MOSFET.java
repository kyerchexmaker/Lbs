package ru.tpu.lab.lb3;

public class MOSFET extends Transistor{
    double Resistance;
    public MOSFET(double Resistance, Component component) {
        super(component);
        this.Resistance = Resistance;
    }

    public String MOSFETDescription(){
        return " Управляется электрическим полем.";
    }

    @Override
    public String TransistorPurpose() {
        return super.TransistorPurpose() + MOSFETDescription();
    }
}
