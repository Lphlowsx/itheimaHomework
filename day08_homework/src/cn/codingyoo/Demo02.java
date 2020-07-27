package cn.codingyoo;
/*
 *  @author:  CodingYoo
 *  date:     7/27/2020  7:17 PM Mon
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 *
 * 题目：朋友聚会的时候可能会玩一个游戏：逢七过。
​    规则是：从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时都要说：过。
​    为了帮助大家更好的玩这个游戏，这里我们直接在控制台打印出1-100之间的满足逢七必过规则的数据。
​    这样，大家将来在玩游戏的时候，就知道哪些数据要说：过
 */

public class Demo02 {
    public static void main(String[] args) {
        SevenGo();
    }

    public static void SevenGo() {

        for (int i = 1; i <= 100; i++) {
            if (i / 10 == 7 || i / 10 % 7 == 1 || i % 7 == 0) {
                System.out.println(i);
            }

        }

    }


}
