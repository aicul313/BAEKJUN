import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        StringTokenizer st;

        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(n.readLine()," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int answerA = 0;
        int answerB = 0;

        while ( A != 0){
            answerA = answerA * 10 + A % 10;
            A /= 10;
        }

        while ( B != 0){
            answerB = answerB * 10 + B % 10;
            B /= 10;
        }

        if(answerA>answerB){
            System.out.println(answerA);
        }else{
            System.out.println(answerB);
        }
        

        n.close();

    }
}
