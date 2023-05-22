package com.tjetc.demo.homework02;

public class English extends Person{
    public English(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void eat(){
        System.out.println("姓名："+ getName() + "性别：" + getSex() + "年龄：" + getAge() +"我喜欢吃三明治");

    }
    public void horseRiding(){
        System.out.println("在练习骑马");
    }
}
