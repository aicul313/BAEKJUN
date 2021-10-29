import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int X = n.nextInt();
        int[] A = new int[N];
        int cnt = 0;

        for(int i=0; i<A.length; i++){
            A[i] = n.nextInt();

            if(A[i]<X){
                cnt++;
            }
        }

        for(int i=0; i<N; i++){
            if(A[i]<X && cnt>0){
                System.out.print(A[i] + " ");
            }
        }

        n.close();

    }
}
