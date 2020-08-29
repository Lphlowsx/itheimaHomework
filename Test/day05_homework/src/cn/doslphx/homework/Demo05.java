package cn.doslphx.homework;
/*
 *  @author:  CodingYoo
 *  date:     7/24/2020  8:32 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Demo05 {

    public static void main(String[] args) {
        /*定义一个数组来存储10个学生的成绩
        {72,89,65,87,91,82,71,93,76,68}，
        计算并输出学生的平均成绩。*/
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("平均成绩为：" + avg);
        System.out.println();


    }
}
