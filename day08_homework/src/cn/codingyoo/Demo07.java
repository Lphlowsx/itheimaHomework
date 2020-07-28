package cn.codingyoo;
/*
 *  @author:  CodingYoo
 *  date:     7/27/2020  9:05 PM Mon
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 * 已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据。
 * 定义一个方法，完成查找该数据在数组中的索引，并在控制台输出找到的索引值。
 */

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 28, 50};
        System.out.println("请输入您要匹配的数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //方法调用
        method(arr,num);

    }
    public static void method(int[] arr,int num){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != num){
                index++;
            }else {
                System.out.println("匹配到的索引值为：" + i);
            }
        }
        if(index == arr.length){
            System.out.println("未找到！");
        }

    }

}
