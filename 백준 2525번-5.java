import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());

        int time = H * 60 + M + C;
        H = time / 60;
        M = time % 60;

        if(H > 23) H = H - 24;

        String sH = Integer.toString(H);
        String sM = Integer.toString(M);

        //br.close();

        System.out.println(sH + " "+ sM);

    }
}
