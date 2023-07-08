import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int m  = sc.nextInt();

        for(int i = 0; i < m; i++) {
            int z = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = z - 1; j < x; j++) {
                arr[j] = y;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
