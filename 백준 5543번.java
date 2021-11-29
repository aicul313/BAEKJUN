import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

       Scanner sc = new Scanner(System.in);
       int burger_min = 2000;
       int drink_min = 2000;
       
       for(int i=0; i<3; i++){
           int burger = sc.nextInt();

            if(burger < burger_min){
                burger_min = burger;
            }
       }

       for(int i=0; i<2; i++){
            int drink = sc.nextInt();

            if(drink < drink_min){
                drink_min = drink;
            }
       }

       int sum = burger_min + drink_min - 50;

       System.out.println(sum);

    }
}
