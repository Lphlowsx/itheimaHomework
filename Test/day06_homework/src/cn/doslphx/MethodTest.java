package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/25/2020  9:56 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class MethodTest {
    public static void main(String[] args) {

        System.out.println("判断奇数：");
        JudgeNum jn = new JudgeNum();
        // jn.judge(13,34);
        int sum = jn.returnTest(13,14);
        System.out.println(sum);
        System.out.println("=========================");

        System.out.println("一个人的作息：");
        Persion p = new Persion();
        p.eat();
        p.sleep();
        p.study();
        System.out.println("=========================");

        //判断两个数的最大值
        System.out.println("判断两个数的最大值:");
        JudgeMax JM = new JudgeMax();
        int max = JM.maxNum(3, 6);
        System.out.println(max);
        System.out.println("=========================");

        System.out.println("获取数组最大值：");
        int[] arr = {12,23,34,45,56,32};
        GetMax getMax = new GetMax();
        int max1 = getMax.max(arr);
        System.out.println(max1);
        System.out.println("=========================");

        System.out.println("打印三个数中的最大值：");
        int max2 = getMax.max(12, 21, 13);
        System.out.println(max2);

        System.out.println("=========================");
        Rectangle rect = new Rectangle();
        int rect1 = rect.Rect(23, 34);
        //System.out.println(rect1);


    }
}
