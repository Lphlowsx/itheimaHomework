package cn.doslphx.homework;
/*
 *  @author:  CodingYoo
 *  date:     7/25/2020  8:55 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Demo08 {
    public static void main(String[] args) {
        /*定义一个数组其中包含多个数字。用自己的方式最终实现，
        奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）*/
        int[] arr = {13,24,46,77,21,34,56,87};
        int[] brr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                brr[i] = arr[i];
                index++;
            }
        }



    }
}
