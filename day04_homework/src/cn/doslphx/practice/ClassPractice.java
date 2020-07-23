package cn.doslphx.practice;

import java.util.Scanner;

public class ClassPractice {

    public static void main(String[] args) {

        //方法：可以实现代码复用
        //方法必须先创建才能使用
        //方法调用：静态调用
        isEvenNumber();
    }

    //定义一个方法，在定义中定义一个变量，判断该数据是否是偶数
    public static void isEvenNumber() {
        //键盘录入一个数，判断是否是奇数
        while (true) {
           // for (int i = 1; i < 5; i++) {
                System.out.println("请输入你要判断的数：");
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    System.out.println("这个数是偶数！");
                } else {
                    System.out.println("这个数是奇数！");
                }



        }
    }


}
