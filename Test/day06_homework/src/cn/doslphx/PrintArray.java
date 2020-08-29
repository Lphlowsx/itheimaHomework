package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/25/2020  4:22 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {12,23,34,32,12,78};
        //打印数组
       // System.out.println(Arrays.toString(arr));
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != 0){
                System.out.print(",");
            }
            System.out.print(arr[i]);

        }
        System.out.println("]");
    }
}
