import java.util.*;
//import java.io.*;

public class Main{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int max = 1;

        while(n != 0){
            int top = 0;
            int bottom = max+1;
            for(int i=1; i<=max; i++){
                n--;
                top++;
                bottom--;

                if(n==0){
                    if(max % 2 != 0){
                        System.out.println(bottom + "/" + top);
                    }else{
                        System.out.println(top + "/" + bottom);
                    }break;
                }
            }
            max++;
        }
    
    }

}
