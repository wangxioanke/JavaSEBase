package com.husheng;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("hello,world" + i);
         */

/*        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);*/
        int max = getMax(4,5);
        System.out.println(max);
        int max1 = getMax(4,5,6);
        System.out.println(max1);

    }

    public static int getMax(int a,int b){
        int max = a > b ? a : b;
        return max;
    }
    public static int getMax(int a,int b,int c){
        System.out.println("重载");
        int max = a > b ? a : b;
        return max;
    }
}
