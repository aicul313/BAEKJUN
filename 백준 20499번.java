import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);

        String test = n.next();
        String arr[] = test.split("/");
        int result[] = new int[3];

        for(int i=0; i<arr.length; i++){
            result[i] = Integer.valueOf(arr[i]);
        }

        if( (result[0] + result[2]) < result[1] || result[1] == 0 ){
            System.out.println("hasu");
        }else{
            System.out.println("gosu");
        }

    }
}
