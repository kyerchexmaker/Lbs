package ru.tpu.lab.lb3;

public class Diode extends ComponentDecorator {

    double MaxCurrent;

    public Diode(double MaxCurrent, Component component) {
        super(component);
        this.MaxCurrent = MaxCurrent;
    }

    public Diode(Component component) {
        super(component);
    }

    public double getMaxCurrent(){
        return MaxCurrent;
    }

    public String DiodePurpose(){
        return " Диод. Проводит ток в одном направлении. Максимальный ток: " + getMaxCurrent() + " А.";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + DiodePurpose();
    }
}
