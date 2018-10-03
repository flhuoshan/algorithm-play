package com.flcoder.algorithm.sort;
import com.flcoder.algorithm.Utils;

public class SortClient {
    public static void main(String[] args){
        int length = 50000;
        Comparable[] arr = Utils.generateAllRandomArray(length);

        SortProxy proxy = new SortProxy(new SelectSort());
        proxy.sort(Utils.copyAnArray(arr));


        proxy = new SortProxy(new InsertSort());

        proxy.sort(Utils.copyAnArray(arr));

        proxy = new SortProxy(new MergeSort());
        proxy.sort(Utils.copyAnArray(arr));

        proxy = new SortProxy(new MergeSortOpt());
        proxy.sort(Utils.copyAnArray(arr));

        proxy = new SortProxy(new MergeSortB2T());
        proxy.sort(Utils.copyAnArray(arr));

        proxy = new SortProxy(new QuickSort());
        proxy.sort(Utils.copyAnArray(arr));

        proxy = new SortProxy(new DoubleQuickSort());
        proxy.sort(Utils.copyAnArray(arr));

        proxy = new SortProxy(new TripleQuickSort());
        proxy.sort(Utils.copyAnArray(arr));
    }
}
