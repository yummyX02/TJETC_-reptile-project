package com.tjetc.demo.homework02;

public class Chinese extends Person{
    public Chinese(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void eat(){
        System.out.println("姓名："+ getName() + "性别：" + getSex() + "年龄：" + getAge() +"我喜欢吃饭");
    }
    public void shadowBoxing(){
        System.out.println("在练习太极拳");
    }
}
