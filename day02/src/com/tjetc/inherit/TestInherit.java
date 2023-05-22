package com.tjetc.inherit;

import com.tjetc.encapsulation.Client;

public class TestInherit {

    public static void main(String[] args){
         /*
    (1)继承的实现
        通过extends来继承父类
        只能继承父类的非私有属性和方法
        查找属性不会找父类的父类
        Java中不支持多继承，因为是纯面向对象语言；但支持多层继承；所有的类都是obiect的子类
    (2)方法重写
        子类重写的方法名要和父类相同
        使用@Override帮助检查是否覆盖父类的方法
    (3)构造器
        创建子类时会调用父类的构造方法
        但子类无法继承父类的构造器
        this and super都是关键字
        this:指向当前掉用方法的对象
        super：调用父类的构造方法;必需写在第一行
    （4）属性的调用顺序（就近原则）
        如果使用子类属性，使用this
        如果使用父类的属性，使用super
        动态绑定：编译看左边，运行看右边，编译时调用不了子类方法，但是运行时会调用
     */
        User user = new User();
        Client cilent = new Client();
        user.run();
        cilent.run();
    }
}
