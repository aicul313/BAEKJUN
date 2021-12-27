import java.util.*;
//import java.io.*;

public class Main{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int[] arr = new int [n];
        int max = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        max = arr[0] * n;

        int cnt = n - 1;

        for(int i=1; i<n-1; i++){
            if(arr[i]*cnt>max){
                max = arr[i] * cnt;
            }
            cnt--;
        }

        System.out.println(max);

        sc.close();
    
    }

}
