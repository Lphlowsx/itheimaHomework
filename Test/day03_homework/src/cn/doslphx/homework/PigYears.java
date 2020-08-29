package cn.doslphx.homework;

public class PigYears {
    public static void main(String[] args) {

        //已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。

        int years = 0;
        for (int temp = 1949;temp >= 1949 &&temp <= 2019;temp++){

            years = (2019 - temp) % 12;
            if (years == 0){
                System.out.println(temp);
            }
        }



    }
}
