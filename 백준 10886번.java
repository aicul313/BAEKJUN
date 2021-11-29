import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int positive = 0;
       int negative = 0;

       for(int i=0; i<n; i++){
           int opinion = sc.nextInt();

           if(opinion == 1){
               positive++;
           }
           else{
               negative++;
           }
       }

       if(positive>negative){
           System.out.println("Junhee is cute!");
       }else{
           System.out.println("Junhee is not cute!");
       }

    }
}
