import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);

        String str = n.nextLine();

        n.close();

        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
            if(i%10 == 9){
                System.out.println();
            }
        }

    }
}
