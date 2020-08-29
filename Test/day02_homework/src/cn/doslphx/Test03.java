package cn.doslphx;

public class Test03 {
    public static void main(String[] args) {
        //1.求不使用优惠时的总价
        double money1 = 24 + 8 + 3;
        //2.判断折后总价
        money1 = (money1 >= 30 ? money1 * 0.8: money1 );
        //3.求使用优惠时的总价
        double money2 = 16 + 8 + 3;
        //4.判断两种花费哪个更少
        double money = money1 < money2 ? money1 : money2;
        //5.打印最终花费
        System.out.println(money);
    }
}