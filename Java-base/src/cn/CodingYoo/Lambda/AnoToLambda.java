package cn.CodingYoo.Lambda;
/*
 *  @author:  CodingYoo
 *  date:     8/8/2020  6:07 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class AnoToLambda {
    public static void main(String[] args) {

        //使用匿名内部类的格式
        method(new jump() {
            @Override
            public void jumpping() {
                System.out.println("this is AnonymousInnerClass！");
            }
        });
        //使用lambda表达式
        method(()->{System.out.println("this is Lambda");});
    }


    public static void method(jump jump){
        jump.jumpping();
    }

}

interface jump{
    void jumpping();
}

