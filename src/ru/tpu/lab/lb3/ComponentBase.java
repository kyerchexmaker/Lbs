package ru.tpu.lab.lb3;

public class ComponentBase implements Component{
    double Price;
    public ComponentBase(double Price) {
        this.Price = Price;
    }

    public double getPrice(){
        return Price;
    }

    @Override
    public String getDescription() {
        return "Цена компонента равно: " + getPrice() + " руб.";
    }
}
