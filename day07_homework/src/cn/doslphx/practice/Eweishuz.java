package cn.doslphx.practice;
/*
 *  @author:  CodingYoo
 *  date:     7/26/2020  4:21 PM Sun
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Eweishuz {
    public static void main(String[] args) {

        int[][] arr2 = {{1,2,3},{2,3,4},{4,5,6} };

        //打印第几个数组的第几个元素,打印二维数组
        System.out.println(arr2[2][2]);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i][i] + " ");
        }


    }
}
