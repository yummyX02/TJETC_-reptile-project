package com.tjetc.inherit;

public class User extends Person1{
    String name  = "数据科学";
    @Override//检查是否是父类的重写方法
    public void run(){
        System.out.println("用户正在跑");
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public User() {
        super("天津理工大学", 19, 100000);
        System.out.println("子类构造器");
    }
}
