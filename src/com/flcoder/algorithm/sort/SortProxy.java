package com.flcoder.algorithm.sort;

public class SortProxy implements Sorter{
    private Sorter sorter;
    private int[] data;
    public SortProxy(int[] data){
        this.sorter = new SelectSort();
        this.data = data;
    }
    @Override
    public void sort(int[] a) {
        this.sorter.sort(a);
    }



    public void measure(){
        long startTime = System.currentTimeMillis();
        sort(this.data);
        long endTime = System.currentTimeMillis();
        System.out.printf("花费时间为%d毫秒", (endTime - startTime));
//        Utils.printAll(this.data);

    }
}
