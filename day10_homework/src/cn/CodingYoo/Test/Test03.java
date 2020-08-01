package cn.CodingYoo.Test;
/*
 *  @author:  CodingYoo
 *  date:     8/1/2020  11:27 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 * 创建一个长度为 5 的数组，利用随机数生成1-100之前的随机数毕竟产生的\
 * 随机数存入数组中，计算数组中的最大值、最小值和平均值并输出，
 * 将内容和索引都是偶数的元素和索引输出到控制台上
 */

import java.util.Arrays;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        //System.out.println(Arrays.toString(arr));
        //将产生的随机数存入数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100 + 1);
            if (arr[i] % 2 == 0 && i % 2 == 0) {
                System.out.println("索引和元素都是偶数的有" + i +" :" + arr[i]);
            }

        }
        //System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        int avg = 0;
        int sum = 0;
        //计算最大值
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值是：" + max);
        //计算最小值
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最小值是：" + min);
        //求和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        //求平均值
        avg = sum / arr.length;
        System.out.println("平均值是：" + avg);

    }
}
