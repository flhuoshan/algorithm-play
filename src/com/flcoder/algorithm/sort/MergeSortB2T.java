package com.flcoder.algorithm.sort;

import static java.lang.Integer.min;

/**
 * 非递归的自底向上归并排序，O(nlogn)
 */
public class MergeSortB2T implements Sorter {
    private static InsertSort insertSort = new InsertSort();
    @Override
    public void sort(Comparable[] a) {
        mergeSort(a, a.length);
    }

    private void mergeSort(Comparable[] a, int n) {
       for( int sz = 1; sz <= n; sz += sz){
           for( int i = 0; i + sz < n; i += sz + sz){
               merge(a, i, i + sz -1, min(i +sz +sz -1, n-1));
           }

       }
    }
    // arr[l...mid]和arr[mid+1...r]两部分进行归并
    private void merge(Comparable[] a, int l, int mid, int r) {
        Comparable[] aux = new Comparable[r - l + 1];
        for (int i = l; i <= r; i++) {
            aux[i - l] = a[i];
        }
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if(i > mid){
                a[k] = aux[j - l];
                j++;
            }else if(j > r){
                a[k] = aux[i - l];
                i++;
            }
            else if(aux[i-l].compareTo(aux[j-l]) < 0){
                a[k] = aux[i - l];
                i++;
            }else{
                a[k] = aux[j - l];
                j++;
            }
        }
    }

    @Override
    public String getSortName() {
        return "自底向上的归并排序";
    }
}
