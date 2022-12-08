package ru.tpu.lab.lb2;

public class storage
{
    int product = 0;
    int limit = 0;
    storage(int amount, int limit)
    {
        this.product = amount;
        this.limit = limit;
    }
    public synchronized void get() {
        while (product<1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе: " + product + "\n");
        notify();
    }
    public synchronized void put() {
        while (product>=limit) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + product + "\n");
        notify();
    }
}
