package cn.CodingYoo.Polymorphic;
/*
 *  @author:  CodingYoo
 *  date:     8/8/2020  9:31 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 *
 *
 * 多态中成员变量访问特点：
 * 成员变量：编译看左边（父类），执行看左边（父类）
 * 成员方法：编译看左边（父类），执行看右边（子类）
 *
 *
 */

public class Test {
    public static void main(String[] args) {
        //传统方式
        cat a = new cat();
        //多态方式
        animal b = new cat();
        a.eat();
        //执行子类方法(右边)
        b.eat();
        System.out.println(b.num);
    }
}

class animal {
    int num = 10;

    void eat() {
        System.out.println("动物吃鱼");
    }
}

class cat extends animal {
    int num = 11;

    @Override
    void eat() {
        System.out.println("猫吃鱼！");
    }
}
