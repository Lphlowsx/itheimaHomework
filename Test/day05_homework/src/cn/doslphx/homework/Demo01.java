package cn.doslphx.homework;
/*
 *  @author:  CodingYoo
 *  date:     7/24/2020  8:05 PM Fri
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {

        //打印数组
        int[] arr = {12,23,34,45,56};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(Arrays.toString(arr));
    }

}
