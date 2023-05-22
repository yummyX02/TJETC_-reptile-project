package com.tjetc.encapsulation;

public class TestEncapsulation {

    public static void main(String[] args){
        /*
        封装
            （1）作用：提高安全性和代码的复用性；减少代码的冗余
            （2）高内聚，低耦合
            流程：
            (1)属性私有化
            将属性私有化使用private访问修饰符修饰
            当前类可以进行访问，其他类看不到了
            (2)方法的简化
            (3)类的封装
         */
        Person person = new Person();
        person.setName("中软国际-天津");
        String myName = person.getName();
        System.out.println(myName);
    }
}

