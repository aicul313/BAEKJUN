import java.util.*;
//import java.io.*;

public class Main{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word;

        word = str.split("-");

        for(int i=0; i<word.length; i++){
            word[i] = word[i].toUpperCase();
            System.out.print((word[i].charAt(0)));
        }

        sc.close();

    }

}
