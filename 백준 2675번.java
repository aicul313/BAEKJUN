import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        int N = n.nextInt();
        
        for(int i=0; i<N; i++){

            int NN = n.nextInt();
            String S = n.next();

            for(int j=0; j<S.length(); j++){
                for(int k=0; k<NN; k++){
                    System.out.print(S.charAt(j));
                }
            }

            System.out.println();

        }

        
    }

}
