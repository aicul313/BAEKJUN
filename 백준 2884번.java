import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int H = n.nextInt();
        int M = n.nextInt();

        int result;

        n.close();

        if( (M - 45) < 0 ){
            H--;
            result = (M - 45) + 60;
            if ( H < 0 ){
                H = 23;
            }
        }else{
            result = M - 45;
        }

        System.out.println(H + " " + result);
    }
}
