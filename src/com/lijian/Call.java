package com.lijian;


import java.util.concurrent.Callable;


public class Call implements Callable<Integer> {

    @Override
    public Integer call() throws Exception
    {
        int i = 0;
        for(;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        Thread.sleep(1000);
        return i;
    }
}
