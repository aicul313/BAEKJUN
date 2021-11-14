import java.util.Scanner;
import java.util.Arrays;

public class Main{
    static int N;
    static int[] p;
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
      
        N = n.nextInt();
        p = new int[N];
      
        for(int i=0; i<N; i++){
            p[i] = n.nextInt();
        }
      
        Arrays.sort(p);
        int num = 0;
        int result = 0;
        
        for(int i=0; i<N; i++){
            result += (num+p[i]);
            num = num + p[i];
        }
      
        System.out.println(result);

    }
}
