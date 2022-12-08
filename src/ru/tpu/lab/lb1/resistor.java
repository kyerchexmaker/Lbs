package ru.tpu.lab.lb1;

public abstract class resistor extends component{
    private String body;
    private String material;

    public resistor(String type, String manufacturer, int price, String body, String material) {
        super(type, manufacturer, price);
        this.body = body;
        this.material = material;
    }

    public String getBody()
    {
        return body;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setBody()
    {
        this.body = body;
    }

    public void setMaterial()
    {
        this.material = material;
    }

    public abstract String getDescription();
}
