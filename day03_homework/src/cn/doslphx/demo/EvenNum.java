package cn.doslphx.demo;

public class EvenNum {
    public static void main(String[] args) {

        //求偶数和
        int sum = 0;
        for (int i = 53; i <= 158; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);


    }
}
