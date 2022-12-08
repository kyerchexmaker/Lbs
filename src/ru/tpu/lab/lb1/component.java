package ru.tpu.lab.lb1;

public abstract class component {

    private String type;
    private String manufacturer;
    private int price;

    public component(String type, String manufacturer, int price)
    {
        this.type = type;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getType()
    {
        return type;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getPrice()
    {
        return price;
    }

    public void setType()
    {
        this.type = type;
    }

    public void setManufacturer()
    {
        this.manufacturer = manufacturer;
    }

    public void setPrice()
    {
        this.price = price;
    }

    public abstract String getDescription();
}
