package cn.doslphx;

public class Narcissus {

    //水仙花数：个 十 百的立方和等于原数
    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {

            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100 ;

            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println("水仙花数为：" + i);
            }

        }

    }
}
