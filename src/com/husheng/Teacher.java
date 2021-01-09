package com.husheng;

public class Teacher extends Person{
    //老师类

    public Teacher() {
    }

    public Teacher(int age, String name) {
        super(age, name);
    }

    public void teach(){
        System.out.println("教书");
    }
}
