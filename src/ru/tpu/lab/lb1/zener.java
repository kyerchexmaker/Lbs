package ru.tpu.lab.lb1;

public class zener extends diode
{
    private float stab_voltage;

    public zener(String type, String manufacturer, int price, float maxvoltage, float maxcurrent, float stab_voltage)
    {
        super(type, manufacturer, price, maxvoltage, maxcurrent);
        this.stab_voltage = stab_voltage;
    }

    public float getStab_voltage()
    {
        return stab_voltage;
    }

    public void setStab_voltage()
    {
        this.stab_voltage = stab_voltage;
    }

    public String getDescription() {
        return "This is ZENER DIODE. His price is " + getPrice() + " rubles. It's produced by " + getManufacturer() +
                ". Umax =  " + getMaxvoltage() + " Volts . Imax = " + getMaxcurrent() +
                " Ampers. Us = " + getStab_voltage() + " Volts.";
    }
}
