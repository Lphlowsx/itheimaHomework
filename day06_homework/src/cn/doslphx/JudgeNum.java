package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/25/2020  10:38 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class JudgeNum {


    public static void judge(int n, int m) {
        //打印n~m之间所有的奇数
        for (int i = n; i <= m; i++)
            if (i % 2 != 0) {
                System.out.println("您输入的奇数为：" + i);
            }


    }
}
