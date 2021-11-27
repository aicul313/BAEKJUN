import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);

        int N = n.nextInt();
        int K = n.nextInt();

        for(int i=1; i<=N; i++){
            if(N % i == 0){
                K--;
            }
            if(K == 0){
                System.out.println(i);
                break;
            }
        }

        if(K != 0){
            System.out.println(0);
        }

        n.close();

    }
}
