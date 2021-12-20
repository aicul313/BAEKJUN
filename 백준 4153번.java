import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        StringTokenizer st;
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));

        while(true){            
            st = new StringTokenizer(n.readLine()," ");
        
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if(A==0 && B==0 && C==0){
                break;
            }

            if(A > B && A > C){
                C += A;
                A = C - A;
                C = C - A;
            }else if(B > C){
                C += B;
                B = C - B;
                C = C - B;
            }

            if( C*C == (A*A)+(B*B)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }

            
    }
}
