package cn.CodingYoo.Test;
/*
 *  @author:  CodingYoo
 *  date:     8/1/2020  1:51 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 * 使用控制台输入一串字符，要求长度在10~15之间（需要使用代码进行校验
 * ，如果输入的字符串不符合要求需要重新输入），字符串中需要包
 * 含大写小写字母和数字（不需要代码校验），分别统计字符串中
 * 大写字母小写字母和数字的个数并输出到控制台（格式：大写字母有3个）
 */

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长度在10~15之间的字符串：");
        String s = sc.next();
        int numberaCount = 0;
        int LetterCount = 0;
        int bigCount = 0;

        while (true) {
            if (s.length() >= 10 && s.length() <= 15) {
                  break;
                }
            }
        //遍历字符串，找出英文和数字
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                numberaCount++;
            }
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            }
            if (ch >= 'a' && ch <= 'z') {
                LetterCount++;
            }
        }
        System.out.println("数字有：" + numberaCount + "个");
        System.out.println("小写字母有：" + LetterCount + "个");
        System.out.println("大写字母有：" + bigCount + "个");
    }
}
