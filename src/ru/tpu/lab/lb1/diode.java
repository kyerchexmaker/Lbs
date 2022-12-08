package ru.tpu.lab.lb1;

public abstract class diode extends component {
    private float maxcurrent;
    private float maxvoltage;

    public diode(String type, String manufacturer, int price, float maxvoltage, float maxcurrent) {
        super(type, manufacturer, price);
        this.maxvoltage = maxvoltage;
        this.maxcurrent = maxcurrent;
    }

    public float getMaxcurrent()
    {
        return maxcurrent;
    }

    public float getMaxvoltage()
    {
        return maxvoltage;
    }

    public void setMaxcurrent()
    {
        this.maxcurrent = maxcurrent;
    }

    public void setMaxvoltage()
    {
        this.maxvoltage = maxvoltage;
    }

    public abstract String getDescription();
}
