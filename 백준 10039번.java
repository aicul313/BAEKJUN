import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for(int i=0; i<5; i++){

            int N = Integer.parseInt(n.readLine());
            
            if(N < 40){
                N = 40;
            }

            sum = sum + N;

        }

        int avg = sum / 5;

        System.out.println(avg);

    }
}
