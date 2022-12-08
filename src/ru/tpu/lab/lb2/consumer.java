package ru.tpu.lab.lb2;

public class consumer extends Thread
{
    storage storage = new storage(0,0);
    consumer(storage storage)
    {
        this.storage = storage;
    }
    public void run()
    {
        while(true)
        {
            storage.get();
            try
            {
                consumer.sleep(1200);//через каждые 5 циклов, склад увеличивается на один т.к. скорость на 0.2 выше
            }
            catch(InterruptedException e)
            {

            }
        }
    }
}
