package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/25/2020  8:30 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Awqf {

    //请定义一个方法，方法能够得到小数类型数字的绝对值并返回

    public static void main(String[] args) {

        double xs = -1.32;
        double v = decimals(xs);
        System.out.println(v);


    }
     public static double decimals(double xs){
        if(xs<0){
            return -xs;
        }else {
            return xs;
        }
     }
}
