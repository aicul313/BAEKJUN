import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        StringTokenizer st;

        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(n.readLine());
        
        int sum = 0;

        for(int i=0; i<N; i++){

            st = new StringTokenizer(n.readLine(),",");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sum = A + B;

            System.out.println(sum);
        }

    }
}
