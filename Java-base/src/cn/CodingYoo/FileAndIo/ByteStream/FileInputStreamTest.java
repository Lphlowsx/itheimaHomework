package cn.CodingYoo.FileAndIo.ByteStream;
/*
 *  @author:  CodingYoo
 *  date:     9/4/2020  7:36 PM Fri
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //从磁盘中读
        FileInputStream fis = new FileInputStream("C:\\Users\\lph\\Desktop\\Projects");
        //向磁盘写入
        FileOutputStream fio = new FileOutputStream("C:\\Users\\lph\\Desktop\\Projects");
        int b;
        fio.write(Integer.parseInt("lph"));
        fio.close();
    }
}
