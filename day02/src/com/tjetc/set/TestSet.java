package com.tjetc.set;

import java.util.HashMap;
import java.util.HashSet;

public class TestSet {
    /*
    set的特点：
        元素存取是无序的，不可以存放重复元素。元素没有下标，元素不可以重复
        主要用于去重处理
     */
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("123");
        set.add("abc");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
    }

}
