package cn.CodingYoo.Thread;
/*
 *  @author:  CodingYoo
 *  date:     8/18/2020  4:57 PM Tue
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.concurrent.FutureTask;

public class MyCallableTest {
    public static void main(String[] args) {

        MyCallable myCallable = new MyCallable();

        FutureTask<String> sf = new FutureTask<String>(myCallable);

        Thread thread = new Thread(sf);
        //开启线程
        thread.start();

    }
}
