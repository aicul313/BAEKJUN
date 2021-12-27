import java.util.*;
//import java.io.*;

public class Main{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int M = N;
        int i = 0;

        sc.close();
    
        while(true){
            N = ( N % 10 * 10) + ((N / 10 + N % 10) % 10);
            i++;
            if(N == M){
                break;
            }
        }

        System.out.println(i);
    
    }

}
