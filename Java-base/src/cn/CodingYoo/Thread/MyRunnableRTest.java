package cn.CodingYoo.Thread;
/*
 *  @author:  CodingYoo
 *  date:     8/18/2020  4:39 PM Tue
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class MyRunnableRTest {
    public static void main(String[] args) {
        //1.创建 MyRunnable对象
        MyRunnable myRunnable = new MyRunnable();
        //2.创建Thread对象
        Thread thread = new Thread(myRunnable);
        //开启线程
        thread.start();
        //创建并开启第二条线程
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

    }
}
