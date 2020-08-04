package cn.CodingYoo.ExtendsDemo;
/*
 *  @author:  CodingYoo
 *  date:     8/4/2020  8:40 AM Tue
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class ExtendsTest {
    public static void main(String[] args) {
        //多态：
        // 前提：有继承/实现关系
        //有方法重写
        // 有父类引用指向子类对象

        Fruits a = new Apple();

        Apple apple = new Apple();
        a.color();
        apple.color();
    }
}
