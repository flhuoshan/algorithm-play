package com.flcoder.algorithm.sort;
import com.flcoder.algorithm.Utils;

public class SortClient {
    public static void main(String[] args){
        int length = 50000;
        int[] arr = Utils.generateAllRandomArray(length);
        int[] arr2 = Utils.copyAnArray(arr);

        Sorter selectSort = new SelectSort();
        SortProxy proxy = new SortProxy(arr, selectSort);
        proxy.sort(arr);


        Sorter insertSort = new InsertSort();
        proxy = new SortProxy(arr2, insertSort);
        proxy.sort(arr2);
    }
}
