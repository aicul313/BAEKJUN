import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        while(true){
            int A = n.nextInt();
            int B = n.nextInt();

            if(A>B){
                System.out.println("Yes");
            }else if(A<B){
                System.out.println("No");
            }else if(A==B){
                if( A == 0 && B == 0){
                    break;
                }else{
                    System.out.println("No");
                }
            }
        }
        
    }
}
