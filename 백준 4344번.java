import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        int C = n.nextInt();

        for(int i=0; i<C; i++){
            int N = n.nextInt();
            double sum = 0;
            int[] arr = new int[N];
            
            for(int j=0; j<N; j++){
                arr[j] = n.nextInt();
                sum = sum + arr[j];
            }

            double avg = sum / N;
            double cnt = 0;

            for(int j=0; j<N; j++){
                if(arr[j]>avg){
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n", (cnt/N)*100);
            
        }

        n.close();
    }

}
