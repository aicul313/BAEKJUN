import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        int N = n.nextInt();
        String A = n.next();
        int sum = 0;

        for(int i=0; i<N; i++){
            sum = sum + A.charAt(i)-'0';
        }

        System.out.println(sum);
    
        n.close();
    }

}
