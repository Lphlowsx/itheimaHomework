package cn.CodingYoo.Test;
/*
 *  @author:  CodingYoo
 *  date:     8/1/2020  5:26 PM Sat
 *  project:  itheimaHomework
 *  github:   https://github.com/CodingYoo
 *  from  那时还是个菜鸟
 * 代码功能要求如下

1. 定义手机类Phone包含三个成员（名称：name，价格：price，信息：message），满参构造以及get/set方法

2. 定义测试类Test，完成以下要求

	1. 定义filter(ArrayList<Phone>, double price){}方法

		要求：遍历list集合，将list集合中价格大于参数price的元素存入到另一个ArrayList\<Phone>中并返回

	2. 在main方法中完成以下要求

		1. 创建并初始化3个Phone对象
		2. 创建一个ArrList<Phone> list Phone，将上边3个Phone对象添加到listPhone中
		3. 调用filter方法传入listPhone和2000并接受返回值，根据接受返回的list集合输出所有元素信息
 */

import cn.CodingYoo.pojo.Phone;

import java.util.ArrayList;

public class Test07 {
    public static void main(String[] args) {
        Phone p1 = new Phone("apple", 3000, "引领时代潮流！");
        Phone p2 = new Phone("huawei", 2500, "华为牛逼！");
        Phone p3 = new Phone("xioami", 4000, "为发烧而生");
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        //未过滤价格之前的手机品牌
        System.out.println(phones);
        //调用filter方法，剔除手机价格小于3000的手机品牌
        ArrayList<Phone> filter = filter(phones, 2800);
        System.out.println(filter);

    }
        //此方法是判断给定集合中手机价格大于指定价格的手机型号并返回
    public static ArrayList<Phone> filter(ArrayList<Phone> list, double price) {
        ArrayList<Phone> phone = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            //遍历获取原集合中的phone对象
            Phone phone1 = list.get(i);
            if (phone1.getPrice() > price) {
                //将手机价格大于指定价格的手机放进新集合中
                phone.add(phone1);
            }

        }
        return phone;
    }


}
