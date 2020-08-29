package cn.CodingYoo;
/*
 *  @author:  CodingYoo
 *  date:     7/30/2020  8:46 PM Thu
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 * 请编写程序，由键盘录入一个字符串，统计字符串中英文字母和
 * 数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
 */

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String line = sc.nextLine();
        //大写转小写
        String s = line.toLowerCase();

        int numberaCount = 0;
        int LetterCount = 0;
        //遍历字符串，找出英文和数字
        for (int i = 0; i < line.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9' ){
                numberaCount++;
            }
            if(ch >= 'a' && ch <= 'z'){
                LetterCount++;
            }
        }
        System.out.println("英文字母有"+ LetterCount +"个");
        System.out.println("数字有"+ numberaCount +"个");

    }
}