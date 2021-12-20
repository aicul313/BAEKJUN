import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 1;

        for(int i=1; i<N+1; i++){

            sum = sum * i;

        }

        System.out.println(sum);
            
    }
}
