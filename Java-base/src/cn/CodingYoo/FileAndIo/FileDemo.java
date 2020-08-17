package cn.CodingYoo.FileAndIo;
/*
 *  @author:  CodingYoo
 *  date:     8/17/2020  8:16 AM Mon
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //删除文件夹和文件夹的内容
        File file = new File("C:\\Users\\lph\\Desktop\\Test");
        deleteDir(file);
    }

    private static void deleteDir(File file) {
        //进入文件夹
        File[] files = file.listFiles();
        //遍历文件夹，得到里边的内容
        for (File file1 : files) {
            if(file1.isFile()){
                //如果是文件，直接删除
                file1.delete();
            }else {
                deleteDir(file1);
            }
        }
        //最后删除文件夹
        file.delete();
        System.out.println("文件夹已删除！");
    }
}
