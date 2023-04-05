import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        StringTokenizer st;

        Scanner n = new Scanner(System.in);
        st = new StringTokenizer(n.nextLine(), " ");
        int answer = 0;

        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            answer = answer + a;
        }

        System.out.println(answer);

    }
}
