import java.util.*;
//import java.io.*;

public class Main{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        int val = 0;
        int num = 0;

        val = sc.nextInt();
        val = 1000 - val;

        while(val >= 500){
            val = val - 500;
            num++;
        }
        while(val >= 100){
            val = val - 100;
            num++;
        }
        while(val >= 50){
            val = val - 50;
            num++;
        }
        while(val >= 10){
            val = val - 10;
            num++;
        }
        while(val >= 5){
            val = val - 5;
            num++;
        }
        while(val >= 1){
            val = val - 1;
            num++;
        }

        System.out.println(num);
    
    }

}
