import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();

        n.close();

        for(int i=1; i<10; i++){
            System.out.println( a + " * " + i + " = " + a*i);
        }

    }
}
