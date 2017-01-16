package com.lazyfighter.sort;

import java.util.Arrays;

/**
 * Created by 李平 on 2016/12/2.
 * ------------冒泡排序-----------
 *
 *
 *
 *
 *
 */
public class BubbleSort {
    public static void sort(int[] array){
        if (array == null || array.length<=0) System.out.println("数组为空，请输入正确数组");

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-1 -i;j++){
                if (array[j]<array[j+1]){
                    continue;
                }else{
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
    public static void main(String[] args) {
        int[] array = new int[]{3,-2,6,4,-1,20,15,321,23,51};
        sort(array);
    }

}
