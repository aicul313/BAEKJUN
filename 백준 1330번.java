import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int A = n.nextInt();
        int B = n.nextInt();

        if(A>B){
            System.out.println(">");
        }else if(A<B){
            System.out.println("<");;
        }else{
            System.out.println("==");
        }

    }
}
