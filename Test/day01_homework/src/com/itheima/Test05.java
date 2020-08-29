package com.itheima;

public class Test05 {
    public static void main(String[] args) {
        // 片段1
        int a = 10;
        {
            a = 20;
            System.out.println(a); // 正常输出20，没有错误
        }

        // 片段2
        {
            int b = 20;
            System.out.println(b); // 正常输出20，没有错误
        }
        // b = 30; // 此处报错，b已经超出其有效范围
        int b = 30; // 需要再重新声明int类型的变量b
        System.out.println(b);
    }
}