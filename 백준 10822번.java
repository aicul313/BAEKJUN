import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);

        String[] S = n.nextLine().split(",");

        int result = 0;
        for(int i=0; i<S.length; i++){
            result += Integer.parseInt(S[i]);
        }

        System.out.println(result);

        n.close();

    }
}
