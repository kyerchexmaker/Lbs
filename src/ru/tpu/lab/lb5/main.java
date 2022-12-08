package ru.tpu.lab.lb5;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        ComponentGenerator componentGenerator = new DiodeGenerator();
        ComponentGenerator componentGenerator1 = new TransistorGenerator();
        System.out.println("Введите количество компонентов: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            switch (rand.nextInt(2)) {
                case 0: {
                    Diode diode = (Diode) componentGenerator.createComponent(getTypeDiode());
                    System.out.println(diode.getDiscription());
                    System.out.println(diode.getInfo());
                    break;
                }
                case 1: {
                    Transistor transistor = (Transistor) componentGenerator1.createComponent(getTypeTransistor());
                    System.out.println(transistor.getDiscription());
                    System.out.println(transistor.getInfo());
                    break;
                }
            }
        }
    }

    public static String getTypeDiode() {
        ArrayList<String> listBody = new ArrayList<>();
        listBody.add("Varistor");
        listBody.add("Zener");
        return listBody.get(new Random().nextInt(2));
    }

    public static String getTypeTransistor() {
        ArrayList<String> listBody = new ArrayList<>();
        listBody.add("MOSFET");
        listBody.add("BJT");
        return listBody.get(new Random().nextInt(2));
    }

}