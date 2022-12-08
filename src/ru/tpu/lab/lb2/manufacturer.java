package ru.tpu.lab.lb2;

public class manufacturer extends Thread
{
    storage storage = new storage(0,0);
    manufacturer(storage storage)
    {
        this.storage = storage;
    }
    public void run()
    {
        while(true)
        {
            storage.put();
            try
            {
                manufacturer.sleep(1000);
            }
            catch(InterruptedException e)
            {

            }
        }
    }
}
