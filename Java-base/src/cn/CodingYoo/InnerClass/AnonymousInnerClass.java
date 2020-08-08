package cn.CodingYoo.InnerClass;
/*
 *  @author:  CodingYoo
 *  date:     8/8/2020  5:25 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class AnonymousInnerClass {
    public static void main(String[] args) {

        //传统的调用格式:实现接口，重写方法，创建对象，使用
        inter01Impl inter01 = new inter01Impl();
        inter01.show();

        //使用匿名内部类: 把实现接口，重写方法，创建对象一次集成
        //这是调用一个方法的格式
        new inter01() {
            @Override
            public void show() {
                System.out.println("匿名内部类重写show方法");
            }
        }.show();

        //调用多个方法：
        inner02 in02 = new inner02() {
            @Override
            public void show1() {
                System.out.println("方法1被调用");
            }

            @Override
            public void show2() {
                System.out.println("方法2被调用");
            }
        };
        //
        in02.show1();
        in02.show2();

    }
}

interface inter01 {
    void show();
}

interface inner02 {
    void show1();

    void show2();

}

class inter01Impl implements inter01{

    @Override
    public void show() {
        System.out.println("重写接口1中的show方法");
    }
}