package cn.doslphx.practice;
/*
 *  @author:  CodingYoo
 *  date:     7/26/2020  4:01 PM Sun
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        //数组反转
        int[] arr = {13, 21, 23, 43, 11, 25, 56};
        //方法调用
        exchangeArray(arr);
    }

    public static void exchangeArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;
        for (; start < end; start++, end--) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}
