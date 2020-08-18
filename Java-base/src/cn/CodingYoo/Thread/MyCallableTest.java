package cn.CodingYoo.Thread;
/*
 *  @author:  CodingYoo
 *  date:     8/18/2020  4:57 PM Tue
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable myCallable = new MyCallable();
        //可以接收线程执行后的结果，并可以作为参数传递给Thread
        FutureTask<String> sf = new FutureTask<String>(myCallable);

        Thread thread1 = new Thread(sf);
        Thread thread2 = new Thread(sf);
        //开启线程
        thread1.start();
        thread2.start();
        //获取 返回值
        String s = sf.get();
        System.out.println(s);
    }
}
