package cn.CodingYoo.InnerClass;
/*
 *  @author:  CodingYoo
 *  date:     8/8/2020  5:45 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class AnoInnerClassPro {
    public static void main(String[] args) {

        //匿名内部类的使用场景：当方法的形式参数是接口的话，可以使用匿名内部类直接传参
        method(new jump() {
            @Override
            public void jumpping() {
                System.out.println("让我们一起跳舞吧！");
            }
        });
    }

    public static void method(jump jump){
        jump.jumpping();
    }
}

interface jump{
    void jumpping();
}
