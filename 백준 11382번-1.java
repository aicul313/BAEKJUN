import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        StringTokenizer st;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int answer = A+B+C;

        String str = Integer.toString(answer);

        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(str);
        bw.flush();
        bw.close();
        
    }
}
