import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        StringTokenizer st;
        Scanner n = new Scanner(System.in);
        st = new StringTokenizer(n.nextLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int answer = A+B+C;

        System.out.println(answer);
    }
}
