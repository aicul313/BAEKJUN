import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
              
        while(n.hasNextInt()){
            int A = n.nextInt();
            int B = n.nextInt();

            System.out.println(A + B);
        }

    }
}
