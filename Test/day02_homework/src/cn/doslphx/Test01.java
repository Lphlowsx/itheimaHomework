package cn.doslphx;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //键盘录入父母身高信息
        System.out.println("请分别输入父亲母亲的身高：");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        double father = sc1.nextDouble();
        double mother = sc2.nextDouble();

         /*
        	儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2

​	         女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
          */
        double son = (father + mother) * 1.08 / 2;
        double doughter = (father*0.923 + mother)/2;

        System.out.println("儿子身高为："+ son+ "厘米");
        System.out.println("女儿身高为：" + doughter+ "厘米");


    }
}
