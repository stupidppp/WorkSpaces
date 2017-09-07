package com.lijian;

abstract class CX{
    public abstract void a ();
    public void b(){
        System.out.println("abstract  implement");
    }
}

public class ChouXiang extends CX implements IT{
    public void a(){
            System.out.println("a");
    }
    public void c (){
        a();
        System.out.printf("MAX is %d \n", IT.MAX);
    }
}
