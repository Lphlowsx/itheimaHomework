package cn.doslphx;


/*2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：

​	0 ~ 3000元的部分，交税3%

​	3000 ~ 12000元的部分，交税10%

​	12000 ~ 25000的部分 ， 交税20%

​	25000 ~ 35000的部分，交税25%

​	35000 ~ 55000的部分，交税30%

​	55000 ~ 80000的部分，交税35%

​	超过80000的部分，交税45%
    请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？


*/

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的工资总额：");
        double money = sc.nextDouble();

        double tax; //交税
        double moneyAfter;//税后工资
        if (money >= 0 && money <= 3000) {
            tax = money * 0.03;
            moneyAfter = money - tax;
            System.out.println("需要交的税为：" + tax);
            System.out.println("税后工资为：" + moneyAfter);

        } else if (money > 3000 && money <= 12000) {
            tax = money * 0.1;
            moneyAfter = money - tax;
            System.out.println("需要交的税为：" + tax);
            System.out.println("税后工资为：" + moneyAfter);
        } else if (money > 12000 && money<= 25000) {
            tax = money * 0.2;
            moneyAfter = money - tax;
            System.out.println("需要交的税为：" + tax);
            System.out.println("税后工资为：" + moneyAfter);
        } else if (money > 25000 && money<= 35000) {
            tax = money * 0.25;
            moneyAfter = money - tax;
            System.out.println("需要交的税为：" + tax);
            System.out.println("税后工资为：" + moneyAfter);

        } else if (money > 35000 && money<= 55000) {
            tax = money * 0.3;
            moneyAfter = money - tax;
            System.out.println("需要交的税为：" + tax);
            System.out.println("税后工资为：" + moneyAfter);

        } else if (money > 55000 && money<= 85000) {
            tax = money * 0.35;
            moneyAfter = money - tax;
            System.out.println("需要交的税为：" + tax);
            System.out.println("税后工资为：" + moneyAfter);

        } else {
            System.out.println("系统错误！");
        }


    }
}
