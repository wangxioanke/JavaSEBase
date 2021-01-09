package com.husheng;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        System.out.println(array.size());

        System.out.println("array: " + array);
        System.out.println(array.get(1));

    }
}
