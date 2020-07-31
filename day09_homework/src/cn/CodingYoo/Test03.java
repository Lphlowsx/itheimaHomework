package cn.CodingYoo;
/*
 *  @author:  CodingYoo
 *  date:     7/30/2020  8:23 PM Thu
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            String code = GetVerificationCode();
            System.out.println("生成的验证码为:" + code);
            System.out.println("请输入您的验证码：");
            String num = sc.nextLine();
            //忽略大小写
            if (code.equalsIgnoreCase(num)) {
                System.out.println("验证成功!");
                break;
            } else {
                System.out.println("验证失败！！请重新输入！");
            }


        }

    }

    //生成验证码
    public static String GetVerificationCode() {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'A'; ch < 'Z'; ch++) {
            sb.append(ch);
        }
        for (char ch = 'a'; ch < 'z'; ch++) {
            sb.append(ch);
        }
        for (char ch = '0'; ch < '9'; ch++) {
            sb.append(ch);
        }

        Random r = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(sb.length());
            code += sb.charAt(index);
        }
        return code;
    }


}
