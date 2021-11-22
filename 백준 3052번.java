import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[] num = new int[42];
        int result = 0;

        for(int i=0; i<10; i++){
            int A = n.nextInt();
            num[A % 42]++;
        }

        n.close();

        for(int i=0; i<42; i++){
            if(num[i] != 0){
                result++;
            }
        }

        System.out.println(result);
    }

}
