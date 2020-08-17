package cn.CodingYoo.FileAndIo;
/*
 *  @author:  CodingYoo
 *  date:     8/17/2020  8:38 AM Mon
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.io.File;
import java.util.HashMap;
import java.util.stream.Stream;

public class GetCountFiles {
    public static void main(String[] args) {
        File it = new File("D:\\Idea Projects\\itheimaHomework");
        HashMap<String, Integer> hm = new HashMap<>();
        getCounts(hm,it);
        System.out.println(hm);
    }

    public static void getCounts(HashMap<String, Integer> hm, File it) {
        File[] file = it.listFiles();
        for (File file1 : file) {
            if(file1.isFile()){
                String file1Name = file1.getName();
                String[] fileNameArr = file1Name.split("\\.");
                //把文件名按.分割，一号索引即是文件后缀名
                if (fileNameArr.length == 2){
                    String fileEndName = fileNameArr[1];
                    if(hm.containsKey(fileEndName)){
                        //统计同种文件出现的次数
                        Integer num = hm.get(fileEndName);
                        num++;
                        hm.put(fileEndName,num);
                    }else {
                        //递归查找文件夹里的文件
                        hm.put(fileEndName,1);
                    }
                }
            }else {
                getCounts(hm,file1);
            }
        }

    }

}
