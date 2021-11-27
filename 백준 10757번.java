import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);

        BigInteger A = n.nextBigInteger();
        BigInteger B = n.nextBigInteger();

        BigInteger sum = A.add(B);

        System.out.println(sum);

    }
}
