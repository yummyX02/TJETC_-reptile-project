package com.tjetc.polymorphism;

public class Dog extends Pet{
    public void run(){
        System.out.println("狗在跑");
    }
    public void eat(String st, int count){
        System.out.println("吃了"+count+"个"+st);
    }
}
