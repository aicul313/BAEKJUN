import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        
        int sum = 0;

        while(true){

            int A = n.nextInt();
            int B = n.nextInt();

            sum = A + B;

            if(A == 0 && B == 0){
                break;
            }else{
                System.out.println(sum);
            }
        }

        n.close();

    }
}
