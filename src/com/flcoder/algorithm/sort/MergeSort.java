package com.flcoder.algorithm.sort;

/**
 * 归并排序，O(nlogn)
 */
public class MergeSort implements Sorter {
    @Override
    public void sort(int[] a) {

    }

    //    递归使用归并排序，对arr[l...r]的范围进行排序
    private void mergeSort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        merge(a, l, mid, r);
    }

    private void merge(int[] a, int l, int mid, int r) {
        int[] aux = new int[r - l + 1];
        for (int i = l; i <= r; i++) {
            aux[i - l] = a[i];

        }
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
        }
    }

    @Override
    public String getSortName() {
        return "归并排序";
    }
}
