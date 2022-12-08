package ru.tpu.lab.lb7;

import java.util.*;
import java.util.Random;

public class main {
    public static int SquareFirstFloor, SquareSecondFloor, SquareThirdFloor, Square;
    public static int ToiletSquare, KitchenSquare, HallSquare, BedroomSquare, BathroomSquare;
    public static Iterator<Room> iteratorFirst, iteratorSecond, iteratorThird;
    public static void main(String[] args) {
        Random random = new Random();
        Room[] FirstFloor = new Room[5];
        ArrayList<Room> SecondFloor = new ArrayList<>();
        LinkedList<Room> ThirdFloor = new LinkedList<>();
        for (int i = 0; i < 5; i++)
        {
            FirstFloor[i] = new Room(getRandomTypeRoom(),random.nextInt(50)+1);
            System.out.println("1 Этаж. Номер комнаты: " + (i+1) + ". Тип комнаты: " + FirstFloor[i].getType() + ". Площадь комнаты: " + FirstFloor[i].getSquare());
            SecondFloor.add(new Room(getRandomTypeRoom(),random.nextInt(50)+1));
            System.out.println("2 Этаж. Номер комнаты: " + (i+1) + ". Тип комнаты: " + SecondFloor.get(i).getType() + ". Площадь комнаты: " + SecondFloor.get(i).getSquare());
            ThirdFloor.add(new Room(getRandomTypeRoom(),random.nextInt(50)+1));
            System.out.println("3 Этаж. Номер комнаты: " + (i+1) + ". Тип комнаты: " + ThirdFloor.element().getType() + ". Площадь комнаты: " + FirstFloor[i].getSquare());
        }
        iteratorFirst = Arrays.stream(FirstFloor).iterator();
        iteratorSecond = SecondFloor.iterator();
        iteratorThird = ThirdFloor.iterator();
        FloorSquare();
        System.out.println("Площадь первого этажа: " + SquareFirstFloor);
        System.out.println("Площадь второго этажа: " + SquareSecondFloor);
        System.out.println("Площадь третьего этажа: " + SquareThirdFloor);
        Square = SquareFirstFloor + SquareSecondFloor + SquareThirdFloor;
        System.out.println("Площадь здания: " + Square);
        System.out.println("Площадь туалетов: " + ToiletSquare);
        System.out.println("Площадь залльных комнат: " + HallSquare);
        System.out.println("Площадь кухонь: " + KitchenSquare);
        System.out.println("Площадь спален: " + BedroomSquare);
        System.out.println("Площадь ванных комнат: " + BathroomSquare);
    }

    public static String getRandomTypeRoom(){
        ArrayList<String> listType = new ArrayList<>();
        listType.add("Kitchen");
        listType.add("Bedroom");
        listType.add("Hall");
        listType.add("Toilet");
        listType.add("Bathroom");
        return listType.get(new Random().nextInt(5));
    }

    public static void FloorSquare(){
        int result = 0;
        Room room;
        while (iteratorFirst.hasNext())
        {
            room = (Room) iteratorFirst.next();
            SquareFirstFloor = SquareFirstFloor + room.getSquare();
            switch (room.getType())
            {
                case "Kitchen":{
                    KitchenSquare = KitchenSquare + room.getSquare();
                    break;
                }
                case "Bedroom":{
                    BedroomSquare = BedroomSquare + room.getSquare();
                    break;
                }
                case "Hall":{
                    HallSquare = HallSquare + room.getSquare();
                    break;
                }
                case "Toilet":{
                    ToiletSquare = ToiletSquare + room.getSquare();
                    break;
                }
                case "Bathroom":{
                    BathroomSquare = BathroomSquare + room.getSquare();
                    break;
                }
            }
        }
        while (iteratorSecond.hasNext())
        {
            room = (Room) iteratorSecond.next();
            SquareSecondFloor = SquareSecondFloor + room.getSquare();
            switch (room.getType())
            {
                case "Kitchen":{
                    KitchenSquare = KitchenSquare + room.getSquare();
                    break;
                }
                case "Bedroom":{
                    BedroomSquare = BedroomSquare + room.getSquare();
                    break;
                }
                case "Hall":{
                    HallSquare = HallSquare + room.getSquare();
                    break;
                }
                case "Toilet":{
                    ToiletSquare = ToiletSquare + room.getSquare();
                    break;
                }
                case "Bathroom":{
                    BathroomSquare = BathroomSquare + room.getSquare();
                    break;
                }
            }
        }
        while (iteratorThird.hasNext())
        {
            room = (Room) iteratorThird.next();
            SquareThirdFloor = SquareThirdFloor + room.getSquare();
            switch (room.getType())
            {
                case "Kitchen":{
                    KitchenSquare = KitchenSquare + room.getSquare();
                    break;
                }
                case "Bedroom":{
                    BedroomSquare = BedroomSquare + room.getSquare();
                    break;
                }
                case "Hall":{
                    HallSquare = HallSquare + room.getSquare();
                    break;
                }
                case "Toilet":{
                    ToiletSquare = ToiletSquare + room.getSquare();
                    break;
                }
                case "Bathroom":{
                    BathroomSquare = BathroomSquare + room.getSquare();
                    break;
                }
            }
        }
    }
}
