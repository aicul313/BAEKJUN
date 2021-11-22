import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        int N = n.nextInt();
        
        for(int i=1; i<=N; i++){

            int score = 0;
            int score1 = 1;

            String C = n.next();

            char[] B = new char[80];

            for(int j=0; j<C.length(); j++){
                B[j] = C.charAt(j);
            }

            for(int j=0; j<C.length(); j++){
                if(B[j] == 'O'){
                    score += score1;
                    score1++;
                }
                if(B[j] == 'X'){
                    score1=1;
                }

            }

            System.out.println(score);

        }
        n.close();
    }

}
