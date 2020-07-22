package cn.doslphx;

public class Counter {

    public static void main(String[] args) {

        //计算0.1厘米的纸需要折叠多少次才能达到珠峰高度
        int count = 0;
        double paper = 0.1;
        double mountEverest = 8848.88;

        while (paper <= mountEverest) {
            paper *= 2;
            count++;
        }
        System.out.println(count);


    }


}
