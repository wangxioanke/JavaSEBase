package com.basic;

/*
 Descirption:
    多态：同一个对象，不同时刻表现不同
 */

class Animal{
    public int age = 40;

    public void eat(){
        System.out.println("动物吃东西");
    }
}

class Cat extends Animal{
    public int age = 20;
    public int weight = 10;

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}

public class SpecialGrammer {
    public static void main(String[] args) {
        //向上转型，只能访问子类重写父类的方法
        Animal a = new Cat();

        System.out.println(a.age);

        a.eat();

        // 向下转型，可以访问到子类的方法
        Cat c = (Cat) a;
        c.playGame();

    }
}
