package com.basic;

/*
    抽象方法: 没有方法体的方法
    子类：要么重写抽象方法所有方法，要么是抽象类
 */

abstract class  Animal1{
    private int age = 20;
    private final String city = "北京";

    public Animal1() {
    }

    public Animal1(int age) {
        this.age = age;
    }

    public void show(){
        age = 40;
        System.out.println(age);
        System.out.println(city);
    }

    public abstract void eat();
}

class Cat1 extends Animal1{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
public class Abstract_Method {
    public static void main(String[] args) {
        Animal1 a = new Cat1();
        a.eat();

        a.show();
    }
}
