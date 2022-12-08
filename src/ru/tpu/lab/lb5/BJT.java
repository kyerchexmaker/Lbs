package ru.tpu.lab.lb5;

public class BJT extends Transistor{
    double Beta;

    public BJT(double Beta){
        this.Beta = Beta;
    }

    public double getBeta() {
        return Beta;
    }

    @Override
    public String getInfo() {
        return "Биполярный транзистор. Управляется током базы. Коэффициент усиления по току: " + getBeta() + ".";
    }
}
