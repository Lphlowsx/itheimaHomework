package cn.doslphx.homework;
/*
 *  @author:  CodingYoo
 *  date:     7/24/2020  8:10 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Demo02 {
    public static void main(String[] args) {
        /*
           现有一个小数数组{12.9,53.54,75.0,99.1,3.14}。
           请编写代码，找出数组中的最小值并打印。
        */

        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最小值是：" + min);
        System.out.println();
    }
}
