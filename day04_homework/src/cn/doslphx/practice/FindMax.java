package cn.doslphx.practice;

public class FindMax {
    public static void main(String[] args) {
        //获取数组的最大值
        int[] arr = {1, 2, 7, 4, 5, 6};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            //System.out.println(arr[i]);
            if (arr[i] > max) {
                max =arr[i];
            }
          //  System.out.println(max);
        }
        System.out.println(max);
    }

}
