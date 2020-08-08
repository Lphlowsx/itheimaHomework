package cn.CodingYoo.Interface;
/*
 *  @author:  CodingYoo
 *  date:     8/8/2020  9:14 AM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public interface Inter03 extends Inter01,Inter02{

    @Override
    default void method() {
        System.out.println("接口多继承，必须重写同名方法");
    }
}
