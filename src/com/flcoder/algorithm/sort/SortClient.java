package com.flcoder.algorithm.sort;
import com.flcoder.algorithm.Utils;

public class SortClient {
    public static void main(String[] args){
        int length = 50000;
        Comparable[] arr = Utils.generateAllRandomArray(length);
        Comparable[] arr2 = Utils.copyAnArray(arr);
        Comparable[] arr3 = Utils.copyAnArray(arr);
        Comparable[] arr4 = Utils.copyAnArray(arr);
        Comparable[] arr5 = Utils.copyAnArray(arr);

        Sorter selectSort = new SelectSort();
        SortProxy proxy = new SortProxy(arr, selectSort);
        proxy.sort(arr);


        Sorter insertSort = new InsertSort();
        proxy = new SortProxy(arr2, insertSort);
        proxy.sort(arr2);

        Sorter mergeSort = new MergeSort();
        proxy = new SortProxy(arr3, mergeSort);
        proxy.sort(arr3);

        Sorter mergeSortOpt = new MergeSortOpt();
        proxy = new SortProxy(arr4, mergeSortOpt);
        proxy.sort(arr4);

        Sorter mergeSortB2T = new MergeSortB2T();
        proxy = new SortProxy(arr5, mergeSortB2T);
        proxy.sort(arr5);
    }
}
