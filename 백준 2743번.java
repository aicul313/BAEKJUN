import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);

        String word = n.next();
        int cnt = 0;

        for(int i=0; i<word.length(); i++){
            word.charAt(i);
            cnt++;
        }
        System.out.println(cnt);
        
    }
}
