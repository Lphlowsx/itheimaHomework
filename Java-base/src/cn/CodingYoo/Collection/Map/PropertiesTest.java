package cn.CodingYoo.Collection.Map;
/*
 *  @author:  CodingYoo
 *  date:     8/18/2020  10:52 AM Tue
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  gitee:    https://gitee.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\Idea Projects\\itheimaHomework\\Java-base\\src\\cn\\CodingYoo\\Collection\\Map\\prop.properties");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
}
