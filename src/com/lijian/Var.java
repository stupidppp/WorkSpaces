package com.lijian;

public class Var   implements  Runnable{
    private volatile boolean  flag;

    public void run() {
        flag = true;
        int i = 100;
        while(flag && (--i == 0)){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end");
    }
    public void stop(){
        flag = false;
    }
}
