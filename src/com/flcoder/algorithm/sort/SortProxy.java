package com.flcoder.algorithm.sort;

public class SortProxy implements Sorter{
    private Sorter sorter;
    public SortProxy(Sorter sorter){
        this.sorter = sorter;

    }
    @Override
    public void sort(Comparable[] a) {
        long startTime = System.currentTimeMillis();
        this.sorter.sort(a);
        long endTime = System.currentTimeMillis();
        System.out.printf("%s[%s]:花费时间为%fS%n", this.sorter.getSortName(), a.length + "条数据",(float)(endTime - startTime)/1000);
    }

    @Override
    public String getSortName() {
        return "";
    }


}
