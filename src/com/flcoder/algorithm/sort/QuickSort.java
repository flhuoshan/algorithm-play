package com.flcoder.algorithm.sort;

import com.flcoder.algorithm.Utils;

import java.util.Random;

public  class QuickSort implements Sorter{
    private static final Random random = new Random(System.currentTimeMillis());
    @Override
    public void sort(Comparable[] a) {

//        quick
        quickSort(a, 0, a.length-1);

    }
    private void quickSort(Comparable[] a, int l , int r){
        if(r <= l){
            return;
        }
        int p = partition(a, l, r);
        quickSort(a, l, p - 1);
        quickSort(a, p + 1, r);
    }

    private int partition(Comparable[] a, int l, int r){
        //选择随机标定值，避免在排序样本近乎有序时，程序退化为O(n^2)
        int pos = random.nextInt(r - l) + l;
        Utils.swap(a, l, pos);

        Comparable v = a[l];
        //a[l+1...j] < v; arr[j+1,...i) > v
        int j = l;
        for(int i = l + 1; i <= r; i++){
            if(v.compareTo(a[i]) < 0){
                Utils.swap(a, ++j, i);
            }
        }
        Utils.swap(a, l, j);

        return j;

    }

    @Override
    public String getSortName() {
        return "普通快速排序";
    }
}
