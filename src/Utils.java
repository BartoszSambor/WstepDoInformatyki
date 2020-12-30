import java.util.Random;

public class Utils {
    static void printArr(int[] a){
        for (int elem : a){
            System.out.print(elem+" ");
        }
        System.out.print("\n");
    }

    static void printArr(int[] a, int mode){
        if(mode == 1){
            for (int elem : a){
                System.out.println(elem);
            }
        }else{
            printArr(a);
        }
    }

    static int[] randomArray(int len){ // 0<=x<=100
        return randomArray(len, 0, 100);
    }

    static int[] randomArray(int len, int max){ // 0<=x<=max
        return randomArray(len, 0, max);
    }

    static int[] randomArray(int len, int min, int max){ // min<=x<=max
        Random generator = new Random();
        int[] arr = new int[len];
        for(int i = 0; i < arr.length; i++){
            arr[i] = generator.nextInt()%(max+1-min)-min;
        }
        return arr;
    }
}
