import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);
        
        int t = n.nextInt();
        int[] arr = new int[t];

        for(int i = 0; i<t; i++) {
        	arr[i] = n.nextInt();
        }

        Arrays.sort(arr);
        
        if(t==1){
        	System.out.println(arr[0]*arr[0]);
        }else{
        	System.out.println(arr[0]*arr[arr.length-1]);
        }

    }
}
