import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);

        String N = n.nextLine();

        n.close();

        int[] arr = new int[N.length()];

        for(int i=0; i<N.length(); i++){
            arr[i] = N.charAt(i) - '0';
        }
        Arrays.sort(arr);

        for(int i=N.length()-1; i>=0; i--){
            System.out.print(arr[i]);
        }

    }
}
