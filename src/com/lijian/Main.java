package com.lijian;


import java.lang.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.FutureTask;


public class Main {

    public static void main(String[] args)
    {
       Main m = new Main();
       m.testLocalDateTime();

    }
    void testLocalDateTime(){

        // 获取当前的日期时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        // 12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        // 22 小时 15 分钟
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        // 解析字符串 - > DateTime
        DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime date5 = LocalDateTime.parse("2017-09-09 20:15:30", DATEFORMATTER);
        System.out.println("date5: " + date5);
    }

    static void func(){
        Call ctt = new Call();
        FutureTask<Integer> ft = new FutureTask<>(ctt);
        for(int i = 0;i < 100;i++)
        {
            System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);
            if(i==20)
            {
                new Thread(ft,"有返回值的线程").start();
            }
        }
        try
        {
            long start = System.currentTimeMillis( );
            System.out.printf("start ready");
            System.out.println("子线程的返回值："+ft.get());
            long end = System.currentTimeMillis();
            System.out.printf("diff %d", end- start);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    static <E extends Number> void print ( E  t){
        System.out.println(t);
    }
    static <T extends Comparable<T>> T max(T x, T y, T z)
    {
        T max = x; // 假设x是初始最大值
        if ( y.compareTo( max ) > 0 ){
            max = y; //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z; // 现在 z 更大
        }
        return max; // 返回最大对象
    }

    void  funcList(){
         List<String> list = new ArrayList<>();
         list.add("a");
         list.add("b");
         list.add("c");
         list.add("d");


         //for (String a : list) {
         //    System.out.println(a);
         //}

         //Object[]  arr = list.toArray();
         //for (int i = 1; i <= arr.length; i++){
         //    System.out.println( (arr[i-1] instanceof  String) ? arr[i-1] : "");
         //}

         // Iterator<String> iter = list.iterator();
         // for (; iter.hasNext();){
         //    System.out.println(iter.next());
         //}
         // iter.remove();
     }
    static  void funcMap(){
         Map<String, List<String> >  map  = new HashMap<>();
         map.put("fasfa", genListString());
         map.put("sfes", genListString());
         map.put("lkaaw", genListString());
         map.put("qkmdss", genListString());

         //for (String key :map.keySet()){
         //    System.out.printf("key: %s value :%s \n", key, map.get(key));
         //}

         //for (List<String> item : map.values()){
         //     System.out.println(item);
         //}
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
           System.out.println(entry);
        }

     }
    static private List<String> genListString(){
         List<String> list = new ArrayList<>();
         list.add("a");
         list.add("b");
         list.add("c");
         list.add("d");
         return list;
     }

}

