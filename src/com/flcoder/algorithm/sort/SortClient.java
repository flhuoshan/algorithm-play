package com.flcoder.algorithm.sort;
import com.flcoder.algorithm.Utils;

public class SortClient {
    public static void main(String[] args){
        int length = 10000;
        int[] arr = Utils.generateAllRandomArray(length);
        SortProxy proxy = new SortProxy(arr);
        proxy.measure();
    }
}
