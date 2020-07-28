package cn.codingyoo;
/*
 *  @author:  CodingYoo
 *  date:     7/27/2020  9:05 PM Mon
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 * 题目：数组反转
 * 已知一个数组 arr = {19, 28, 37, 46, 50};
 * 用程序实现把数组中的元素值反转(在原数组中操作，不能定义第二个数组)，
 * 反转后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出反转后的数组元素
 */

public class Demo08 {
    public static void main(String[] args) {
        int [] arr = {19, 28, 37, 46, 50};
        exchange(arr);
    }

    public static void exchange(int[] arr){
        int start = 0;
        int end = arr.length -1;
        int temp;
        for (; start<end; start++,end--) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //遍历新数组
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
