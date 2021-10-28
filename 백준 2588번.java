import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int A = n.nextInt();
        String B = n.next();

        n.close();

        System.out.println(A * (B.charAt(2)-'0'));
        System.out.println(A * (B.charAt(1)-'0'));
        System.out.println(A * (B.charAt(0)-'0'));
        System.out.println(A * Integer.parseInt(B));
        
    }
}
