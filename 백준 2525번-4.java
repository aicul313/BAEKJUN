import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        H += C / 60;
        M += C % 60;

        if(H > 23){
            H -= 24;
        }

        if(M > 59){
            H++;
            M -= 60;
        }

        br.close();

        System.out.println(H + " " + M);
    }
}
