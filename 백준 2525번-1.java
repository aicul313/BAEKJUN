import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int takeM = M+C;
        int resultM = 0;
        
        if( takeM > 59 ){
            H++;
            resultM = takeM - 60;
            if( H < 0 ) H = 23;
        }
        else{
            resultM = takeM;
        }

        br.close();

        System.out.println(H + " " +resultM);
    }
}
