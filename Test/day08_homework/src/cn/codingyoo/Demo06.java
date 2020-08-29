package cn.codingyoo;
/*
 *  @author:  CodingYoo
 *  date:     7/27/2020  8:55 PM Mon
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 * 题目：设计一个方法，用于比较两个数组的内容是否相同。
 * 思路：数组相同，则数组长度相同，数组下标对应元素相等
 */

public class Demo06 {
    public static void main(String[] args) {

        int[] arr = new int[]{12, 13, 45, 32};
        int[] brr = new int[]{12, 19, 45, 32};
        boolean value = judgeArray(arr, brr);
        System.out.println(value);

    }
    //此方法判断；两个数组是相同
    public static boolean judgeArray(int[] arr, int[] brr){
        if(arr.length != brr.length){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != brr[i]){
                return false;
            }
        }
        return true;
    }

}
