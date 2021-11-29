import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

       StringTokenizer st;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       st = new StringTokenizer(br.readLine(), " ");

       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       int C = Integer.parseInt(st.nextToken());

       int money = 0;
       int max = 0;

       if(A == B && A == C && B == C){
           money = 10000 + (A * 1000);
       }else if(A == B && A != C && B != C){
           money = 1000 + (A * 100);
       }else if(A != B && A == C && B != C){
           money = 1000 + (A * 100);
       }else if(A != B && A != C && B == C){
           money = 1000 + (B * 100);
       }else if(A != B && A != C && B != C){
           if( A > B && A > C){
               max = A;
           }else if( B > A && B > C ){
               max = B;
           }else if( C > A && C > B ){
               max = C;
           }
           money = max * 100;
       }

       System.out.println(money);

    }
}
