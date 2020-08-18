package cn.CodingYoo.Thread;
/*
 *  @author:  CodingYoo
 *  date:     8/18/2020  4:28 PM Tue
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class MyThread extends Thread{

    //开启多线程的第一种方法：继承Thread类，重写run方法

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程" + i);
        }
    }
}
