import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int year = A - 1946;

        sc.close();

        System.out.println(year);

    }
}
