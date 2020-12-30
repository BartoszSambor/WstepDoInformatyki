import jdk.jshell.execution.Util;

public class Lab2 {

    public static void zadanie1(){
        for(int i = 100; i <= 999; i++){
            if(Math.pow(i/100, 3) + Math.pow((i/10)%10,3) + Math.pow(i%10,3) == i){
                System.out.println(i);
            }
        }
    }

    public static void zadanie2(){
        for( int i = 10; i <= 99; i++){
            int dcube = (int) (Math.pow(i, 3) * 2);
            int sum = i/10 + i%10;
            if(dcube % sum == 0){
                System.out.println(i);
            }
        }
    }

    public static void zadanie3(){
        for(int i = 1000; i < 9999; i++){
            if(i/1000 == i%10 && (i/100)%10 == (i/10)%10){
                System.out.println(i);
            }
        }
    }

    static int[] zadanie4(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    static int[] zadanie6(int[] arr) {
        int length = arr.length;
        int i, j, k;
        for (i = 0; i < length; i++) {
            k = i;
            for (j = i + 1; j < length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                    int tmp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = tmp;
                }

            }
        }
        return arr;
    }
}
