import java.util.Random;

public class CustomProxy {

    public int[] generateAllRandomArray(int length){
        int[] generatedArray = new int[length];
        Random random = new Random(System.currentTimeMillis());
        for(int i :generatedArray){
            generatedArray[i] = random.nextInt();
        }
        return generatedArray;
    }

    public int[] copyAnArray(int[] orgArray){
        int[] newArray = new int[orgArray.length];
        System.arraycopy(orgArray, 0, newArray, 0, orgArray.length);
        return newArray;
    }

    public void measure(){
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        System.out.printf("花费时间为%l秒", (endTime - startTime));

    }

}
