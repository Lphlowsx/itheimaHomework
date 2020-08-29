package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/26/2020  8:50 AM Sun
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Random;

public class RandomArrSubScript {

    /*一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
            请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复*/

    public static void main(String[] args) {

        int[] arr = {2, 588, 888, 1000, 10000};
        int[] brr = new int[arr.length];
        //定义一个索引
        int index = 0;
        Random r = new Random();

        while (index <arr.length){
            int i = r.nextInt(arr.length);
            boolean b = judge(brr,arr[i]);
            if(!b){
                brr[index] = arr[i];
                index++;
                System.out.println(arr[i] + "元大奖被抽出");
            }

        }

    }

    public static boolean judge(int[] brr, int num) {
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] == num) {
                return true;
            }
        }
        return false;

    }


}
