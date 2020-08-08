package cn.CodingYoo.Polymorphic;
/*
 *  @author:  CodingYoo
 *  date:     8/8/2020  9:31 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Test {
    public static void main(String[] args) {
        //传统方式
        cat a = new cat();
        //多态方式
        animal b = new cat();

        a.eat();
        b.eat();
    }
}
class animal{
    void eat(){
        System.out.println("动物吃鱼");
    }
}
class cat extends animal{
    @Override
    void eat() {
        System.out.println("猫吃鱼！");
    }
}
