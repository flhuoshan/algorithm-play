import java.util.Arrays;

public class Tst{
    int a,b;
    public Tst(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static void swap(Tst left, Tst right){
        int tmp = left.a;
        left.a = right.a;
        right.a = tmp;
    }

    public static void swap(int left, int right){
        int tmp = left;
        left = right;
        right = tmp;
    }

    public static void swap1(Integer left, Integer right){
        Integer tmp = left;
        left = right;
        right = tmp;
    }


    public static void main(String[] args){


        Tst t1 = new Tst(1,2);
        Tst t2 = new Tst(3,4);

        swap(t1, t2);

        System.out.println(123);

        int a = 1, b = 2;
        swap(a, b);
        System.out.println(a);

        Integer c = 3, d = 4;
        swap1(c, d);
        System.out.println(c);





    }
}
