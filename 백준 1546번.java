import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double arr[] = new double[n.nextInt()];

        for(int i=0; i<arr.length; i++){
            arr[i] = n.nextDouble();
        }

        double sum = 0;
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            sum += (arr[i]/arr[arr.length-1]*100);
        }

        System.out.println(sum/arr.length);
    }

}
