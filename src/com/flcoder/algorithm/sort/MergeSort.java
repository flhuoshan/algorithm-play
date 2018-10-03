package com.flcoder.algorithm.sort;

/**
 * 使用递归的，自顶向下的归并排序，O(nlogn)
 */
public class MergeSort implements Sorter {
    @Override
    public void sort(Comparable[] a) {
        mergeSort(a, 0, a.length - 1);
    }

    //    递归使用归并排序，对arr[l...r]的范围进行排序
    private void mergeSort(Comparable[] a, int l, int r) {

        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        merge(a, l, mid, r);
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
        return "归并排序";
    }
}
