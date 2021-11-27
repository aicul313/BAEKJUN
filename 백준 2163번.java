import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        n.close();

        System.out.println((a*b)-1);

    }
}
