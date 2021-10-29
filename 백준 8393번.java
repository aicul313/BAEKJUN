import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();

        int sum = 0;

        for(int i=1; i<=a; i++){
            sum = sum + i;
        }

        System.out.println(sum);

        n.close();

    }
}
