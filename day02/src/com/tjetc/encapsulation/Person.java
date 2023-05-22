package com.tjetc.encapsulation;

public class Person {
    private static String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    /*封装的缘由:
        减少代码的冗余和增加复用性
     */
    public void eatBreakfast(){
        // 做饭
        cook();
        // 吃饭
        // 洗碗
        }
    public void eatDinner(){
        // 做饭
        cook();
        // 吃饭
        // 洗碗
    }
    public void eatLaunch(){
        // 做饭
        cook();
        // 吃饭
        // 洗碗
    }
    private void cook(){
        System.out.println("做完饭了~");
    }
    public static void  main(String[] args){
        Person person = new Person();
        person.name = "中软国际-天津";
        System.out.println(name);
    }
}
