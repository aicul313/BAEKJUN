import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);

        String num = n.next();
        int length = num.length();
        int sum = 0;

        if(length == 2){
            sum = num.charAt(0) + num.charAt(1) - 96;
        }else if(length == 3){
            if(num.charAt(1) == '0'){
                sum = num.charAt(2) - 38;
            }else{
                sum = num.charAt(0) - 38;
            }
        }else{
            sum = 20;
        }

        n.close();
        System.out.println(sum);

    }
}
