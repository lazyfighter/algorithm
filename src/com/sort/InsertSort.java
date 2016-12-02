package com.sort;

import java.util.Arrays;

/**
 * Created by 李平 on 2016/12/2.
 *  -------------插入排序--------------
 *
 *  插入算法是对少量元素进行排序的有效算法
 *
 *  原理：
 *      从第一个元素开始，拿去第二个元素与第一个比较进行插入
 *      然后拿去第三个元素在进行比较，进行插入
 *      插入的时候需要将比元素大的向后移
 *
 *  ----------------------------------
 */


public class InsertSort {


    public static void sort(int[] array){

        if (array == null || array.length<=0) System.out.println("数组为空，请输入正确数组");

        for (int i =1;i<array.length;i++){
            int tmp = array[i];
            for (int j =i;j>0;j--){
                if (tmp < array[j-1]){
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,2,6,4,1,20,15,321,23,51};
        sort(array);
    }

}
