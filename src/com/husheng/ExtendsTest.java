package com.husheng;

public class ExtendsTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("林宝宝");
        t1.setAge(30);
        t1.teach();

        ExtendStudent s = new ExtendStudent();
        s.setName("村头二傻子");
        s.setAge(15);

        s.study();
    }
}
