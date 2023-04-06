import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int longN = N / 4;

        for(int i=0; i<longN; i++)
        {
            System.out.print("long ");
        }

        System.out.println("int");

    }
}
