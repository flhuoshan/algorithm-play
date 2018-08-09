package com.flcoder.algorithm.sort;

import com.flcoder.algorithm.Utils;

public class InsertSort implements Sorter {
    @Override
    public void sort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    Utils.swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    @Override
    public String getSortName() {
        return "插入排序";
    }
}
