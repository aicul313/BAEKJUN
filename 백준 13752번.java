import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        int N = n.nextInt();

        for(int i=0; i<N; i++){
            int A = n.nextInt();

            for(int j=0; j<A; j++){
                System.out.print("=");
            }
            System.out.println();
        }

        n.close();

    }
}
