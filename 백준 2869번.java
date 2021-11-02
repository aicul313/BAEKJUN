import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        int A = n.nextInt();
        int B = n.nextInt();
        int V = n.nextInt();

        int day = ( V - B ) / ( A - B );

        if (( V - B ) % ( A - B ) != 0){
            day++;
        }

        System.out.println(day);

        n.close();
                
    }
}
