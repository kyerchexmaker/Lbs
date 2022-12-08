package ru.tpu.lab.lb5;

public class MOSFET extends Transistor{
    double Resistance;
    public MOSFET(double Resistance){
        this.Resistance = Resistance;
    }

    public double getResistance() {
        return Resistance;
    }

    @Override
    public String getInfo() {
        return "Полярный транзистор. Управляется электрическим полем. Входное сопротивление: " + getResistance() + " Ом.";
    }
}
