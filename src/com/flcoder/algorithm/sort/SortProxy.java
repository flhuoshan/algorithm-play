package com.flcoder.algorithm.sort;

public class SortProxy implements Sorter{
    private Sorter sorter;
    private int[] data;
    public SortProxy(int[] data, Sorter sorter){
        this.sorter = sorter;
        this.data = data;
    }
    @Override
    public void sort(int[] a) {
        this.sorter.sort(a);
    }

    @Override
    public String getSortName() {
        return "";
    }


    public void measure(){
        long startTime = System.currentTimeMillis();
        sort(this.data);
        long endTime = System.currentTimeMillis();
        System.out.printf("%s[%s]:花费时间为%fS%n", this.sorter.getSortName(), this.data.length + "条数据",(float)(endTime - startTime)/1000);

    }
}
