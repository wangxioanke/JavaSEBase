package com.basic;

/*
    接口方法:
        成员变量：常量
        方法：抽象方法

     类与类的关系：
        继承，只能单继承，但可多层继承

     类与接口的关系：
        实现关系：可以单实现，也可以多实现，还可以继承一个类同时实现多个接口

     接口与接口的关系
        继承关系：可以单继承，也可以多继承
 */

interface Inter{
    public int num = 10;
    public final int num2 = 20;
    int num3 = 30;
    public abstract void method();
    void show();
}

class InterImpl extends Object implements Inter{
    public InterImpl() {
        super();
    }
    @Override
    public void method(){
        System.out.println("method");
    }

    @Override
    public void show(){
        System.out.println("show");
    }

}
public class Interface_Method {
    public static void main(String[] args) {
        Inter i = new InterImpl();

        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(i.num3);
        i.method();
    }
}
