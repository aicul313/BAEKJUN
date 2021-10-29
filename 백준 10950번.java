import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int T = n.nextInt();

        for(int i=0; i<T; i++){
            int A = n.nextInt();
            int B = n.nextInt();
            System.out.println(A+B);
        }

        n.close();

    }
}
