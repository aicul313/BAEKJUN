import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
       
        int[] num = new int[3];

        for(int i=0; i<3; i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        System.out.println(num[1]);

        

        sc.close();
    }
}
