import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);

        int sum = 0;
        int min = 100;

        for(int i=0; i<7; i++){
            int num = n.nextInt();

            if(num % 2 != 0){
                sum += num;
                if(min >= num){
                    min = num;
                }
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }

        n.close();

    }
}
