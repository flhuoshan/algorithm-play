package com.flcoder.algorithm;

import java.util.Random;

public class Utils {

    public static void swap(int arr[], int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }


    public static int[] generateAllRandomArray(int length){
        int[] generatedArray = new int[length];
        Random random = new Random(System.currentTimeMillis());
        for(int i=0; i < length; i++){
            generatedArray[i] = random.nextInt();
        }
        return generatedArray;
    }

    public static void printAll(int[] arr){
        String temp = "";
        for(int a : arr){
            temp = temp + a + " ";
        }
        System.out.print(temp);
    }

    public static int[] copyAnArray(int[] orgArray){
        int[] newArray = new int[orgArray.length];
        System.arraycopy(orgArray, 0, newArray, 0, orgArray.length);
        return newArray;
    }
}
