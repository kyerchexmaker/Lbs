package ru.tpu.lab.lb1;

public class mosfet extends transistor
{
    private float forward_voltage;

    public mosfet(String type, String manufacturer, int price, String kind, float power, float forward_voltage)
    {
        super(type, manufacturer, price, kind, power);
        this.forward_voltage = forward_voltage;
    }

    public float getForwardVoltage()
    {
        return forward_voltage;
    }

    public void setForwardVoltage()
    {
        this.forward_voltage = forward_voltage;
    }

    public String getDescription() {
        return "This is MOSFET. His price is " + getPrice() + " rubles. It's produced by " + getManufacturer() +
                ". This is a " + getKind() + " type transistor. Power equals " + getPower() +
                " Watts. Uf = " + getForwardVoltage() + " Volts";
    }
}
