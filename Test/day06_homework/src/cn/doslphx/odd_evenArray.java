package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/26/2020  9:43 AM Sun
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Arrays;

public class odd_evenArray {
    //把一个数组中的奇数放在左边，偶数放在右边
    public static void main(String[] args) {

        int[] arr = {12, 23, 34, 45, 67, 78, 11, 22};
        int[] brr = new int[arr.length];

        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                brr[start] = arr[i];
                start++;
            } else {
                brr[end] = arr[i];
                end--;

            }
        }
        //遍历新数组
        System.out.println(Arrays.toString(brr));


    }
}

