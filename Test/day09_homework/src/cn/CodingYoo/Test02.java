package cn.CodingYoo;
/*
 *  @author:  CodingYoo
 *  date:     7/30/2020  8:08 PM Thu
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        String code = GetVerificationCode();
        System.out.println(code);
    }
    //随机生成4位验证码
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
