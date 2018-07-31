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



    public static void main(String[] args){
        SortAlgorithm sort = new SortAlgorithm();
        int[] testData = {3,2,1,7,8,4,5,9,0};
        int[] resultData = sort.insertSortG(testData);
        Arrays.stream(resultData).forEach(s -> System.out.print(s + " "));
    }

}
