public class Lab1 {

    static void rec(int a){
        for(int i = 1; i < a*2; i+=2){
            for(int j = 0; j < a-i/2; j++)
                System.out.print(" ");
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println("");
        }

    }

    static void recRev(int a){
        for(int i = a*2-1; i > 0; i-=2){
            for(int j = 0; j < a-i/2; j++)
                System.out.print(" ");
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
