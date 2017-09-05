package com.lijian;

import java.util.*;

public class Test {
    private String name;
    static int  id;
    public Test(String name) {
        this.name = name;
    }
    public void setName(String name){
        String str = "Add";
        this.name = name + str;
    }
    public String getName(){
        return this.name;
    }
    static void setId(int i){
        // System.out.println(name); 无法从静态上下文中引用非静态 变量 name
        Test.id = i;
    }
}
