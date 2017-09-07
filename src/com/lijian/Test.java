package com.lijian;

// 方法的重写(Overriding)和重载(Overloading)

public class Test  implements  Comparable<Test> {
    private String name;
    private static int  id;
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
    public int compareTo(Test t){
        return name.compareTo(t.getName());
    }
    protected  void f (){
        System.out.println("protected method!");
    }
}

class T2 extends Test{
     T2(String n){

         super(n);
     }
     public void getProtectedMethod(){
         super.f();
     }
     public void f(){
         System.out.println("protect -> public");
     }
     public void f(int a){

     }
}



class  inclass {
    private static inclass  sl;
    private inclass(){
        System.out.println("ok");
    }

    public  static inclass newInClass(){
        if (sl == null)
            sl = new inclass();
        return sl;
    }
}
