package com.flcoder.algorithm.sort;

/**
 * 归并排序，O(nlogn)
 */
public class MergeSortOpt implements Sorter {
    private static InsertSort insertSort = new InsertSort();
    @Override
    public void sort(Comparable[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    //    递归使用归并排序，对arr[l...r]的范围进行排序
    private void mergeSort(Comparable[] a, int l, int r) {
        //归并到一定小的数量级时，MlogN的结果> N^2，可以在这个时候，使用插入排序
        if(r - l <= 15){
            insertSort.sort(a, l , r);
            return;
        }
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        //归并排序优化1，对近乎有序的数据，做该优化
        if(a[mid].compareTo(a[mid + 1]) > 0){
            merge(a, l, mid, r);
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
        return "归并排序优化";
    }
}
