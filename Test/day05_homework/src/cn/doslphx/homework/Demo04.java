package cn.doslphx.homework;
/*
 *  @author:  CodingYoo
 *  date:     7/24/2020  8:24 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Demo04 {
    public static void main(String[] args) {

            /*
            *有一个整数数组。请编写代码，让数组的最后一个元素代表个位，
            * 倒数第二个元素代表十位，以此类推。最终得到一个大的整数。
            *
            * */
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


        System.out.println();
        //1.定义数组
        int[] arr2 = {1,3,5,7,9};
        //2.定义变量存储最终的整数
        int num = 0;
        //3.对数组进行遍历
        for (int i = 0; i < arr2.length; i++) {
            //4.计算
            num = num * 10 + arr2[i];
        }
        //5.打印结果
        System.out.println(num);
        System.out.println();
    }
}
