package com.tjetc.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestList {
    /*
    集合
        （1）collection接口
         (2)list的特点：元素存取是有序的，可存放重复元素。元素都有下标
         (3)泛型—— 一个标签:规定我们存数据时必须往里面存什么类型，去的时候就是什么类型的数据，方便取用
     */
    public static void main(String[] args) {
//        原始方式
//        ArrayList arr = new ArrayList();
//        arr.add("张三");
//        arr.add(1);
//        arr.add(0.8);
//        System.out.println(arr);
//        Object o = arr.get(0);
//        String str = (String)o;
//        使用泛型
        ArrayList<String> list= new ArrayList<>();
//        添加
        list.add("hello world");
        list.add("java");
//        获取
        String s = list.get(0);
//        判断集合是否为空
        System.out.println(list.isEmpty());
//        获取集合的大小
        System.out.println(list.size());
//        判断集合是否包含每个元素
        System.out.println(list.contains("123"));
//        删除符合条件的第一个元素
        list.remove("123");
        System.out.println(list);

        for (String s1 : list) {
            System.out.println(s1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
    }
}
