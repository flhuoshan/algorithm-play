package com.flcoder.algorithm.sort;

import com.flcoder.algorithm.Utils;

import java.util.Random;

/**
 * 三路快速排序
 * 三路快速排序处理 a[l...r]
 * 将a[l...r]分为<v;==v;>v三部分
 * 之后递归对< v; >v两部分继续进行三鹿快速排序
 */
public  class TripleQuickSort implements Sorter{
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
        int pos = random.nextInt(r - l) + l;
        Utils.swap(a, l, pos);
        Comparable v = a[l];

        int lt = l;
        int gt = r + 1;
        int i = l + 1;
        while( i < gt){
            if(a[i].compareTo(v) < 0){
                Utils.swap(a, i, lt + 1);
                lt++;
                i++;
            }else if(a[i].compareTo(v) > 0){
                Utils.swap(a, i ,gt -1);
                gt--;
            }else{
                i++;
            }
        }
        Utils.swap(a, l, lt);
        quickSort(a, l, lt-1);
        quickSort(a, gt, r);

    }


    @Override
    public String getSortName() {
        return "三路快速排序";
    }
}
