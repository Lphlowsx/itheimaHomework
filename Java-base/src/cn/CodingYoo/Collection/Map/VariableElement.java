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

    //可变参数
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
