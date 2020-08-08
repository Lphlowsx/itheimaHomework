package cn.CodingYoo.Interface;
/*
 *  @author:  CodingYoo
 *  date:     8/8/2020  8:40 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class InterDemoImpl implements InterDemo{
    @Override
    public void method() {
        //接口实现必须重写方法，或者使用抽象类继承
        System.out.println("接口实现");

        InterDemo.eat();
    }
}
