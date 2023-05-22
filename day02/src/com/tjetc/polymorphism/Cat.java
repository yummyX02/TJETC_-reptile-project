package com.tjetc.polymorphism;

public class Cat extends Pet{
    public void run(){
        System.out.println("猫在跑");
    }

    public void eat(String st){
        System.out.println("吃了"+st);
    }
}
