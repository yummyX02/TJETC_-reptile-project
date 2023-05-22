package com.tjetc.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args){
        /*
        多态
            执行同一个行为的不同方式
            (1) 方法的重载方式
                方法名相同，参数列表不同。
                方法覆盖在不同类中，方法重载在同一个类中
                方法覆盖参数相同，方法重载参数列表不同。
            (2)多态实现的三个步骤
                创建继承关系
                重写父类方法
                父类类型创建 子类对象
                如果要使用子类对象的方法需要将父类类型转成子类类型再调用
                使用instanceof进行判断
                if(worker instanceof Worker){
                    Worker worker1 = (Worker)worker;
                    worker1.work();
                 }
         */
//        Pet pet = new Pet() ;
//        pet.eat() ;
//        pet.eat("草");
//        pet.eat("草",1) ;
        Pet pet = new Pet();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Master master = new Master();
        master.run(dog);
        master.run(cat);
    }
}
