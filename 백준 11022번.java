import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int T = n.nextInt();

        int sum = 0;

        for(int i=1; i<=T; i++){
            int A = n.nextInt();
            int B = n.nextInt();

            sum = A + B;

            System.out.println("Case #" + i +": " + A + " + " + B + " = " + sum);
        }

        n.close();

    }
}
