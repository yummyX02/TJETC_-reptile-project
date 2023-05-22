package com.tjetc.day01;

public class Person {
    static String name;
    int age;
    char sex;
    int schoolNum;
//  定义类方法
    public void eat(String kuaizi){
        System.out.println(kuaizi);
    }

    public String drink(String cup) {
        return "我喝完了~";
    }
    public static void main(String[] args){
        Person person = new Person();
        Person.name = "王翔";
        String name = person.name;
        System.out.println(name);
        person.eat("银筷子");
        String drink =  person.drink("咖啡");
        System.out.println(drink);

    }
}

