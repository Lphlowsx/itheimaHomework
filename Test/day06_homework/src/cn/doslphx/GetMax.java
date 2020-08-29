package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/25/2020  5:10 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class GetMax {

    //定义一个数组，该方法能够找出两个数中的最大值并返回。在主方法中调用方法进行测试。
    public int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    //定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行
    //方法重载
    public int max(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else if (b > c && b > a) {
            return b;
        }else {
            return c;
        }
    }

}
