package com.tjetc.encapsulation;

import com.tjetc.inherit.Person1;

public class Client extends Person1 {
    private String name;
    private int age;
    private double price;

    public Client() {
        //调用父类有参构造器
        super("天津理工大学",19,100000);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void run(){
        System.out.println("客户正在跑");
    }
}
