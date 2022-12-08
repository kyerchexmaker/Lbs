package ru.tpu.lab.lb1;

public class rheostat extends resistor
{
    private float resistance;

    public rheostat(String type, String manufacturer, int price, String body, String material, float resistance)
    {
        super(type, manufacturer, price, body, material);
        this.resistance = resistance;
    }


    public float getResistance()
    {
        return resistance;
    }

    public void setResistance()
    {
        this.resistance = resistance;
    }

    public String getDescription() {
        return "This is Rheostat. His price is " + getPrice() + " rubles. It's produced by " + getManufacturer() +
                ". Type of body:  " + getBody() + ". Made of " + getMaterial() +
                ". R = " + getResistance()+" Ohms";
    }
}
