package cn.codingyoo;
/*
 *  @author:  CodingYoo
 *  date:     7/27/2020  7:51 PM Mon
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 * 题目：我国古代数学家张丘建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
​    百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 */

public class Demo04 {
    public static void main(String[] args) {
        moneyChicken();

    }

    //百钱白鸡
    public static void moneyChicken() {
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y < 33; y++) {
                int z = 100 - x - y;
                if (5 * x + 3 * y + z / 3 == 100 && z % 3 == 0) {
                    System.out.println(x + " " + y + " " + z);
                }
            }
        }

    }
}
