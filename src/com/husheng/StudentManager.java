package com.husheng;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    /*
    1. 输出语句完成主页面
    2. Scanner实现键盘录入数据
    3. switch操作选择
    4. 循环回到主界面
     */

    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        while(true){
            System.out.println("-----欢迎来到学生管理系统------");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查看所有学生");
            System.out.println("5. 退出");
            System.out.println("请输入你的选择： ");

            //用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line){
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    delStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllstudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0); //JVM退出
            }
        }
    }

    private static void findAllstudent(ArrayList<Student> array) {
        // 获取所有学生信息
        if (array.size() == 0){
            System.out.println("无信息，请添加信息");
            return;
        }
        for(int i = 0;i<array.size();i++){
            Student s = array.get(i);

            System.out.println("学生姓名: " + s.getName() + "\t" + "学生学号: " + s.getSid()
            + "\t" + "学生年龄: " + s.getAge() + "岁" + "\t" + "居住地: " + s.getAddress() );
        }
    }

    private static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要修改的学生的学号: ");
        String sid = sc.nextLine();

        System.out.println("请输入学生的新姓名: ");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄: ");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地: ");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        boolean flag = false;

        for(int i=0;i<array.size();i++){
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
                flag = true;
                array.set(i,s);
            }
        }
        if (flag){
            System.out.println("修改成功");
        }else {
            System.out.println("不存在该用户，请核实");
        }

    }

    /*
        删除学生
     */
    private static void delStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生学号: ");
        String sid = sc.nextLine();

        int index = -1;
        for(int i = 0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("该学号不存在，请核实");
        }else{
            array.remove(index);
            System.out.println("删除学生成功");
        }
    }

    private static void addStudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);

        String sid;

        while(true){
            System.out.println("请输入学生学号: ");
            sid = sc.nextLine();

            boolean flag = isUsed(array,sid);
            if (flag) {
                System.out.println("你的学号被占用，请重新输入");
            }else {
                break;
            }
        }
        System.out.println("请输入学生姓名: ");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄: ");
        String age = sc.nextLine();

        System.out.println("请输入学生居住地: ");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);

        System.out.println("添加学生成功");
    }

    private static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;

        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }

        return flag;
    }
}
