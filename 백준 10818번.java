import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        int[] a = new int[N];

        int max = -1000000;
        int min = 1000000;

        for(int i=0; i<a.length; i++){
            a[i] = n.nextInt();
            if(a[i] > max) max = a[i];
            if(a[i] < min) min = a[i];
        }

        System.out.println(min + " " + max);

        n.close();

    }
}
