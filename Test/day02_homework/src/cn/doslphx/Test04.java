package cn.doslphx;

public class Test04 {
    public static void main(String[] args) {
        double originalPrice = 7988* 0.8;
        double saleMoney = 7988 - 1500;

        if (originalPrice> saleMoney){
            System.out.println("选择卖给二手市场！");
        }else {
            System.out.println("选择以旧换新！");
        }
    }
}
