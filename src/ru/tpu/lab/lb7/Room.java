package ru.tpu.lab.lb7;

public class Room {
    String Type;
    int Square;
    public Room(String Type, int Square)
    {
        this.Type = Type;
        this.Square = Square;
    }

    public String getType() {
        return Type;
    }

    public int getSquare() {
        return Square;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public void setSquare(int square) {
        this.Square = square;
    }
}
