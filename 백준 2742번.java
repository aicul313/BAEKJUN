import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();

        for(int i=0; i<a; i++){
            System.out.println(a-i);
        }

        n.close();

    }
}
