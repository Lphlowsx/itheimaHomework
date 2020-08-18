package cn.CodingYoo.FileAndIo;
/*
 *  @author:  CodingYoo
 *  date:     8/18/2020  3:52 PM Tue
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        //读数据
        FileInputStream fis = new FileInputStream("C:\\demo.txt");
        //写数据
        FileOutputStream fos = new FileOutputStream("D:\\demo.txt");
        int b;
        while ((b = fis.read())!= -1){
            fos.write(b);
        }
        //关闭流
        fis.close();
        fos.close();
    }
}
