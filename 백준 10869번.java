import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int A = n.nextInt();
        int B = n.nextInt();

        int sum = A + B;
        int sub = A - B;
        int mul = A * B;
        int share = A / B;
        int remainder = A % B;


        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(share);
        System.out.println(remainder);

    }
}
