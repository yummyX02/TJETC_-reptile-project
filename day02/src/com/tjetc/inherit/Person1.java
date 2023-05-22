package com.tjetc.inherit;

public class Person1 {
    static String name = "计算机科学";
    int age;
    double money;
    public void run(){
        System.out.println("人正在跑");
    }
    public Person1(String s, int i, int i1) {
        System.out.println("父类构造器");
    }
}
