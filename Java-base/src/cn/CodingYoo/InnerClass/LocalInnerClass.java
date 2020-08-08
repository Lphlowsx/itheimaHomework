package cn.CodingYoo.InnerClass;
/*
 *  @author:  CodingYoo
 *  date:     8/8/2020  5:09 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class LocalInnerClass {

    //局部内部类
    //位置：方法中
    //调用格式：只能在方法中，创建对象，并访问
    public static void main(String[] args) {
        outer outer = new outer();
        outer.method();
    }
}
class outer{
    public void method(){
        //这是一个局部内部类
        class inner{
            public void show(){
                System.out.println("局部内部类方法已被调用");
            }
        }

        inner in = new inner();
        in.show();
    }
}