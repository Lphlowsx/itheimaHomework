package cn.CodingYoo.InnerClass;
/*
 *  @author:  CodingYoo
 *  date:     8/8/2020  5:00 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class PriaviteInnerClass {
    public static void main(String[] args) {

        //私有内部类成员调用方法
        //在自己的外部类中创建对象访问

        /*
        静态成员内部类访问格式：外部类类名.内部类名  对象名 = new 外部类类名.内部类名（）;
        * */
        innerClass inner = new innerClass();
        inner.method();
    }

    static class innerClass{
        private int num;
        public void show(){
            System.out.println("这是一个内部类！");
        }

        public void method(){
            innerClass in = new innerClass();
            in.show();
        }
    }
}
