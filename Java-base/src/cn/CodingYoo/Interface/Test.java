package cn.CodingYoo.Interface;
/*
 *  @author:  CodingYoo
 *  date:     8/8/2020  9:12 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Test {
    public static void main(String[] args) {
        //调用接口中的静态方法，使用接口名+方法（）；
        InterDemo.eat();
        Inter03Impl inter03 = new Inter03Impl();
        //调用本类方法
        inter03.method();

    }
    static class Inter03Impl implements Inter03{

    }
}
