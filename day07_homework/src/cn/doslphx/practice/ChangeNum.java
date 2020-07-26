package cn.doslphx.practice;
/*
 *  @author:  CodingYoo
 *  date:     7/26/2020  3:56 PM Sun
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class ChangeNum {

    public static void main(String[] args) {

        exchange(2,3);
    }

    public static void exchange(int a,int b) {

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("交换后为：" +a);
        System.out.println("交换后为：" +b);

    }
}

