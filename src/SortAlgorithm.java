import java.awt.*;
import java.util.Arrays;

public class SortAlgorithm {

    private SortAlgorithm(){
    }



    private void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


    private void printAll(int[] arr){
        String temp = "";
        for(int a : arr){
            temp = temp + a;
        }
        System.out.println(temp);
    }

    //反向
    private int[] bubbleSort(int[] data){
        int n = data.length;
        int i, j;
        for(i=0; i < n; i++){
            for(j= 1; j < n-i; j++){
                if(data[j] < data[j-1]){
                    swap(data, j-1, j);
                }
            }
        }
        return data;
    }

    //正向
    private int[] bubbleSort2(int[] data){
        int n = data.length;
        int i, j;
        for(i=n-1; i >=0; i--){
            for(j= n-1; j > n-i-1; j--){
                if(data[j] < data[j-1]){
                    swap(data, j-1, j);
                }
            }

            printAll(data);
        }
        return data;
    }

    private int[] selectSort(int[] data){
        for(int i=0; i<data.length; i++){
            int minIndex = i;
            for(int j=i+1;j<data.length;j++){
                if(data[j] < data[minIndex]){
                    minIndex = j;
                }
            }
            swap(data ,i, minIndex);
        }
        return data;
    }



    public int[] insertSort(int[] data){
        for(int i=1; i<data.length; i++){
            for(int j=i; j>0; j--){
                if(data[j] < data[j-1]){
                    swap(data, j, j-1);
                }else{
                    break;
                }
            }
        }
        return data;
    }

    //插入排序改进
    public int[] insertSortG(int[] data){
        int n = data.length;
        for(int i=0; i<data.length; i++){
            int temp = data[i];
            int j=i;
            for(; j>0; j--){
                if(temp < data[j-1]){
                    data[j]=data[j-1];
                }else{
                    break;
                }
            }
            data[j] = temp;
        }
        return data;
    }

    //希尔排序(经典）O(n^2)
    public int[] shellSort(int[] arr){

        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
        return arr;
    }

    //希尔排序（O(n^3/2)）
    public int[] shellSort2(int[] data){

        int gap = 1,i,j,len = data.length;
        int temp;

        while(gap< len/3)
            gap = gap * 3 + 1;// <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...

        for (;gap > 0;gap /=3){
            for(i = gap; i < len; i++){
                temp = data[i];
                for(j=i -gap; j >= 0 && data[j] > temp; j-=gap){
                    data[j+gap] = data[j];
                    data[j + gap] = temp;
                }
            }
        }

        return data;
    }



    public static void main(String[] args){
        SortAlgorithm sort = new SortAlgorithm();
        int[] testData = {3,2,1,7,8,4,5,9,0};
        int[] resultData = sort.bubbleSort2(testData);
//        Arrays.stream(resultData).forEach(s -> System.out.print(s + " "));
    }

}
