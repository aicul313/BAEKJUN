import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int[] a = new int[9];
       
        int result = -100;
        int cnt = 0;

        for(int i=0; i<9; i++){
            a[i] = n.nextInt();

            if(a[i] > result){
                result = a[i];
                cnt = i+1;
            }

        }

        System.out.println(result);
        System.out.println(cnt);

        n.close();

    }
}
