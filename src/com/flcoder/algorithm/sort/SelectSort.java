package com.flcoder.algorithm.sort;
import com.flcoder.algorithm.Utils;
public class SelectSort implements Sorter {

    @Override
    public void sort(Comparable[] arr) {
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            Utils.swap(arr ,i, minIndex);
        }
    }

    @Override
    public String getSortName() {
        return "选择排序";
    }
}
