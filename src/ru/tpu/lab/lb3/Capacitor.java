package ru.tpu.lab.lb3;

public class Capacitor extends ComponentDecorator {
    double Capacity;

    public Capacitor(double Capacity, Component component) {
        super(component);
        this.Capacity = Capacity;
    }

    public Capacitor(Component component) {
        super(component);
    }


    public double getCapacity(){
        return Capacity;
    }
    public String CapacitorPurpose(){
        return " Конденсатор. Накапливает электрический заряд. Ёмкость: " + getCapacity() + " ф.";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + CapacitorPurpose();
    }
}
