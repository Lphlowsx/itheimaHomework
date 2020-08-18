package cn.CodingYoo.Thread;
/*
 *  @author:  CodingYoo
 *  date:     8/18/2020  4:54 PM Tue
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        //实现多线程的第三种方式
        for (int i = 0; i < 100; i++) {
            System.out.println("开启" + i);
        }
        return "结束！";
    }

}
