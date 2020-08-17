package cn.CodingYoo.FileAndIo;
/*
 *  @author:  CodingYoo
 *  date:     8/17/2020  5:58 PM Mon
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流
        BufferedReader bf = new BufferedReader(new FileReader("D:\\Idea Projects\\a.txt"));

        //读取数据
        char[]  ch  =  new char[1024];
        int len;
        while ((len = bf.read(ch) )!= -1){
            System.out.println(new String(ch,0,len));
        }

        bf.close();
    }
}
