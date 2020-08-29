package cn.CodingYoo.Test;
/*
 *  @author:  CodingYoo
 *  date:     8/1/2020  2:12 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 * 分析以下需求并用代码实现
1. 从键盘循环录入字符串，输入“end”表示结束（end不计入字符串）
2. 将字符串中大写字母变成小写字母，小写字母变成大写字母，其他字符用“*”代替，将结果输出到控制台
 */

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.next();
        String s1 = null;
        if(s.equals("end")){
            System.out.println("欢迎下次光临！");
            System.exit(0);
        }else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(ch >= 'A' && ch <= 'Z' ){
                     char temp = (char)(ch + 32);
                     sb.append(temp);
                    //System.out.println(s1);
                } else if(ch >= 'a' && ch <= 'z'){
                    char temp = (char)(ch - 32);
                    sb.append(temp);
                }else {
                    sb.append("*");
                }
            }
            System.out.println("变化后的字符串为：" + sb );
        }

    }
}
