package cn.CodingYoo.Thread;
/*
 *  @author:  CodingYoo
 *  date:     8/18/2020  4:29 PM Tue
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        //开启两条线程
        myThread1.start();
        myThread2.start();
    }
}
