package cn.doslphx;
/*
 *  @author:  CodingYoo
 *  date:     7/25/2020  10:52 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Test01 {
    public static void main(String[] args) {
        //方法调用
        double num = 3.74;
        int i = method(num);
        System.out.println(i);

    }

    //请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。
    // 四舍五入之后的结果是一个int整数类型并返回。最后对方法进行测试
    public static int method(double num) {
        int a = (int) (num * 10) % 10;
        if(a< 5){
            return (int)num;
        }else {
            return (int)num + 1;
        }
    }


}
