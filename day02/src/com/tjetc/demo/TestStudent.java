package com.tjetc.demo;

import java.util.HashMap;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        HashMap<String,Student> hashMap = new HashMap<>();
        Student stu1 = new Student("张三","20212001",18);
        Student stu2 = new Student("李四","20212002",20);
        hashMap.put(stu1.getStuId(),stu1);
        hashMap.put(stu2.getStuId(),stu2);
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            System.out.println("键:" + s + "值："+hashMap.get(s).toString());
//            System.out.println("键:" + s + "值："+hashMap.get(s));
        }
    }

}
