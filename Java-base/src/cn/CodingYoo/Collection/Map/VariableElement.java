package cn.CodingYoo.Collection.Map;
/*
 *  @author:  CodingYoo
 *  date:     8/16/2020  7:24 AM Sun
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class VariableElement {

    //可变参数:其实是一个数组，如果有多个参数，则放在可变参数之前，不然会报错
    public static void main(String[] args) {
        int sum = getSum(1, 2, 3, 5);
        System.out.println(sum);
    }

    private static int getSum(int...arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }


}
