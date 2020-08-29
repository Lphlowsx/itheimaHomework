package cn.CodingYoo.Test;
/*
 *  @author:  CodingYoo
 *  date:     8/1/2020  10:37 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = new int[5];
        //arr1 = arr;

        System.out.println(Arrays.toString(arr1));


        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println("jjjj" + a + b);

        int i = 10, j = 18, k = 30;
        switch(j - i) {
            case 8: k++;
            case 9: k += 2;
            case 10: k += 3;
            default: k /= j;
        }

        System.out.println(k);


    }
}
