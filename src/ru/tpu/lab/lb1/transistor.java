package ru.tpu.lab.lb1;

public abstract class transistor extends component {
    private String kind;
    private float power;

    public transistor(String type, String manufacturer, int price, String kind, float power) {
        super(type, manufacturer, price);
        this.kind = kind;
        this.power = power;
    }

    public String getKind()
    {
        return kind;
    }

    public float getPower()
    {
        return power;
    }

    public void setKind()
    {
        this.kind = kind;
    }

    public void setPower()
    {
        this.power = power;
    }

    public abstract String getDescription();
}

