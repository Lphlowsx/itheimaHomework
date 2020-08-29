package cn.CodingYoo.pojo;
/*
 *  @author:  CodingYoo
 *  date:     8/1/2020  5:35 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 */

public class Phone {
    //定义手机类Phone包含三个成员（名称：name，价格：price，信息：message），满参构造以及get/set方法
    private String name;
    private double price;
    private String message;

    public Phone(String name, double price, String message) {
        this.name = name;
        this.price = price;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", message='" + message + '\'' +
                '}';
    }
}
