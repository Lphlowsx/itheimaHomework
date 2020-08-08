package cn.CodingYoo.Interface;
/*
 *  @author:  CodingYoo
 *  date:     8/8/2020  8:39 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */


//接口中没有构造方法，默认访问object的构造方法

public interface InterDemo {
    public static final int num = 2; //默认被public static final修饰

    void method();    //默认加public abstrasct

     public static void eat() {
        System.out.println("私有静态方法");
    }



}
