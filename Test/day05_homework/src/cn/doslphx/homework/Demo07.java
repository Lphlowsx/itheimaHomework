package cn.doslphx.homework;
/*
 *  @author:  CodingYoo
 *  date:     7/25/2020  8:36 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Demo07 {

    public static void main(String[] args) {
        /*小李用自己的钱买了十只股票，年末他看了各只股票的收益分别是
        0.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,0.9%,-4.5%,5.5%。
        请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票分别有多少只？打印效果如下：
        赚钱的股票一共有：4只
        赔钱的股票一共有：6只
        */
        double[] arr = {0.4/100, -3/100, -6.2/100 , 1.2/100, -6.1/100, -19/100, -3.8/100, 0.9/100, -4.5/100, 5.5/100};
        int makeMoney = 0;
        int loseMoney = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                makeMoney++;
            }else {
                loseMoney++;
            }
        }
        System.out.println("赚钱的股票有" + makeMoney + "只");
        System.out.println("赔钱的股票有" + loseMoney + "只");

    }
}
