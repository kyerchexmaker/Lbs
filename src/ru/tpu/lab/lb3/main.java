package ru.tpu.lab.lb3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class main
{
    public static void main(String[] args) {
        System.out.println("Введите число компонентов N: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Component> ComponentArray = new ArrayList<>();
        for (int i = 0; i < N; i++){
            Random random = new Random();
            switch (random.nextInt(3)){
                case 0 -> {
                    ComponentArray.add(new Zener(random.nextDouble(10) + 1, new Diode(random.nextDouble(10),
                            new ComponentBase(random.nextDouble(500)))));
                    System.out.println("Зенер");
                    break;
                }
                case 1 -> {
                    ComponentArray.add(new VariableCapacitor(random.nextDouble(50), new Capacitor(random.nextDouble(100),
                            new ComponentBase(random.nextDouble(500)))));
                    System.out.println("Перерменный конденсатор");
                    break;
                }
                case 2 -> {
                    ComponentArray.add(new MOSFET(random.nextDouble(20), new Transistor(random.nextDouble(100),
                            new ComponentBase(random.nextDouble(500)))));
                    System.out.println("МОСФЕТ");
                    break;
                }

            }
        }
        for (int i = 0; i < N; i++){
            System.out.println(ComponentArray.get(i).getDescription());
        }

    }
}
