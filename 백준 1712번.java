import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int A = n.nextInt();
        int B = n.nextInt();
        int C = n.nextInt();

        if ( B >= C ){
            System.out.println(-1);
        }else{
            System.out.println(A/(C-B)+1);
        }
        
    }
}
