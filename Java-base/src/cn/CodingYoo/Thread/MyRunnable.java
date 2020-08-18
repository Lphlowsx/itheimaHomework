package cn.CodingYoo.Thread;
/*
 *  @author:  CodingYoo
 *  date:     8/18/2020  4:38 PM Tue
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("创建线程的第二种方法：" + i);
        }
    }
}
