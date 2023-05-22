package com.tjetc.interfacedemo;

public class Computer implements USB{
    /*
    接口
        （1）通过interface定义一个接口
            接口无法创建对象
        （2）实现接口使用implements实现
     */
    @Override
    public void connect() {
        System.out.println("实现连接效果");
    }
}
