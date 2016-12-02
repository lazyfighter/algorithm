package com.sort;

import java.util.Arrays;

/**
 * Created by 李平 on 2016/12/2.
 *  -------------插入排序--------------
 */


public class InsertSort {


    public static void sort(int[] array){

        if (array == null || array.length<=0) System.out.println("数组为空，请输入正确数组");

        for (int i =1;i<array.length;i++){
            if (array[i]<array[i-1]){

            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,2,6,4,1,20,15,321,23,51};
        sort(array);
    }

}
