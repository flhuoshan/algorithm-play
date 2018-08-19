package com.flcoder.algorithm;

import java.util.Random;

public class Utils {

    public static void swap(Comparable arr[], int l, int r){
        Comparable temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }


    public static Comparable[] generateAllRandomArray(int length){
        Comparable[] generatedArray = new Comparable[length];
        Random random = new Random(System.currentTimeMillis());
        for(int i=0; i < length; i++){
            generatedArray[i] = random.nextInt(length);
        }
        return generatedArray;
    }

    public static void printAll(int[] arr){
        String temp = "";
        for(int a : arr){
            temp = temp + a + " ";
        }
        System.out.println(temp);
    }

    public static Comparable[] copyAnArray(Comparable[] orgArray){
        Comparable[] newArray = new Comparable[orgArray.length];
        System.arraycopy(orgArray, 0, newArray, 0, orgArray.length);
        return newArray;
    }
}
