package com.flcoder.algorithm.sort;

import com.flcoder.algorithm.Utils;

import java.util.Random;

/**
 * 双路快速排序
 */
public  class DoubleQuickSort implements Sorter{
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
        int i = l +  1, j = r;
        while( true ){
            while ( i <= r && a[i].compareTo(v) < 0){
                i++;
            }

            while( j >= l + 1 && a[j].compareTo(v) > 0){
                j--;
            }

            if(i > j){
                break;
            }
            Utils.swap(a, i, j);
            i++;
            j--;
        }
        Utils.swap(a, l, j);


        return j;

    }

    @Override
    public String getSortName() {
        return "双路快速排序";
    }
}
