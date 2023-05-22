package com.tjetc.map;

import java.util.HashMap;
import java.util.Set;

public class TestMap {
    /*
    map的特点:
        线程不安全，速度快，允许存放null键，null值
        无序的
        map的put方法当没有存在的键时，添加新的元素如果键存在则是修改操作，将原来的键所对应的值进行修改
        允许存放null值和  null键
     */
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
//        添加数据
        hashMap.put("高启强",10);
        hashMap.put(null,null);
        System.out.println(hashMap);
        //清空集合
//        hashMap.clear();
//        System.out.println(hashMap);
        //局部清除
        hashMap.remove("高启强");
        System.out.println(hashMap);
//        判断是否为空
        System.out.println( hashMap.isEmpty());
//        根据键判断是否包含
        System.out.println(hashMap.containsKey(null));
//        根据值判断是否包含
        System.out.println(hashMap.containsValue(10));
//        根据键找值
        System.out.println(hashMap.get(null));
//        遍历map
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            System.out.println("键:" + s + "值："+hashMap.get(s).toString());
        }
    }
}
