package com.husheng;

public class ExtendStudent extends Person{
    public ExtendStudent() {
    }

    public ExtendStudent(int age, String name) {
        super(age, name);
    }

    public void study(){
        System.out.println("学习");
    }
}
