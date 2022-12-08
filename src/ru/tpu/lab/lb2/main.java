package ru.tpu.lab.lb2;

import java.util.Scanner;

public class main
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Введите размер склада:");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        System.out.println("Введите начальное каоличество товаров:");
        int amount = scanner.nextInt();
        storage storage = new storage(amount, limit);
        manufacturer manufacturer = new manufacturer(storage);
        consumer consumer = new consumer(storage);
        new Thread(manufacturer).start();
        new Thread(consumer).start();
    }
}
