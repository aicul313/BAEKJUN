import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        if( C+M > 59 ){
            H++;
            M = C + M - 60;
        }
        else{
            M = C + M;
        }

        if(H>23) H = H - 24;
        if( M == 60 ){
            M = 0;
            H++;
        }

        br.close();

        System.out.println(H + " " + M);
    }
}
