package com.tjetc.polymorphism;

public class Pet {
    String name;

    public Pet() {
    }

    public void eat(String st){
        System.out.println("吃了"+st);
    }

    public Pet(String name) {
        this.name = name;
    }

    public void eat() {
    }

    public void eat(int count, String st){
        System.out.println("eat something");
    }
    public void eat(String st,int count){
        System.out.println("吃了"+count+"个"+st);
    }
    public void run(){
        System.out.println("宠物跑");
    }
}
