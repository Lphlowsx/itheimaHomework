package cn.CodingYoo.FileAndIo;
/*
 *  @author:  CodingYoo
 *  date:     8/17/2020  5:46 PM Mon
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        FileWriter fw = new FileWriter("D:\\Idea Projects\\a.txt");

        fw.write(username);

        //换行
        fw.write("\r\n");
        fw.write(password);

        fw.flush();
        fw.close();
    }
}
