import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        StringTokenizer st;

        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(n.readLine());

        for(int i=0; i<N; i++){

            st = new StringTokenizer(n.readLine()," ");
            
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");

        }

        bw.close();

    }
}
