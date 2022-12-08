package ru.tpu.lab.lb1;

import java.util.Scanner;
    import java.util.ArrayList;
    import java.util.Random;

public class main
{
    public static void main(String[] args)
    {
        System.out.println("Enter the N: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        showComponent(randomComponent(N));
    }

    public static ArrayList<component> randomComponent(int n) {
        Random random = new Random();
        ArrayList<component> componentArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            switch (random.nextInt(3)){
                case 0: componentArray.add(new mosfet("Transistor", getRandomManufacturer(), random.nextInt(12),"Field Effect Transistor",random.nextFloat(50) +5,random.nextFloat(50) +5));
                case 1: componentArray.add(new zener("Diode", getRandomManufacturer(), random.nextInt(12), random.nextFloat(20),random.nextFloat(50) + 5,random.nextFloat(20) +5));
                case 2: componentArray.add(new rheostat("Resistor", getRandomManufacturer(), random.nextInt(12), getRandomBody(), getRandomMaterial(),random.nextFloat(50) + 5));
            }
        }
        return componentArray;
    }

    public static void showComponent(ArrayList<component> componentArray) {
        for (component device : componentArray) {
            System.out.println(device.getDescription());
        }
    }

    public static String getRandomManufacturer() {
        ArrayList<String> listManufacturer = new ArrayList<>();
        listManufacturer.add("TSMC");
        listManufacturer.add("Samsung");
        listManufacturer.add("Anshan");
        listManufacturer.add("Abarcon");
        return listManufacturer.get(new Random().nextInt(4));
    }

    public static String getRandomMaterial() {
        ArrayList<String> listMaterial = new ArrayList<>();
        listMaterial.add("Silicon");
        listMaterial.add("Carbon");
        listMaterial.add("Composites");
        return  listMaterial.get(new Random().nextInt(3));
    }

    public static String getRandomBody() {
        ArrayList<String> listBody = new ArrayList<>();
        listBody.add("SOD80");
        listBody.add("7343");
        listBody.add("SMC");
        listBody.add("SOD15");
        return listBody.get(new Random().nextInt(4));
    }

}
