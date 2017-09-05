package com.lijian;

import java.io.EOFException;
import java.lang.*;
import java.util.*;
public class Main {

    public static void main(String[] args)  {
       int i = Test.id ;
       Test.setId(2);
       int after = Test.id;
       System.out.println("before i = " + i + "\nAfter i = " + after);
    }



}

