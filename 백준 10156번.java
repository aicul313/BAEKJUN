import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);
        
        int k = n.nextInt();
        int N = n.nextInt();
        int m = n.nextInt();

        n.close();

        int add = 0;

        if(k*N > m){
            add = k*N-m;
        }

        System.out.println(add);

    }
}
