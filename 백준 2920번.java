import java.util.*;
//import java.io.*;

public class Main{

    public static void main(String[] args) {
    
		Scanner sc= new Scanner(System.in);

		int[] rep = new int[8];

		for(int i=0; i<rep.length; i++){
			rep[i] = sc.nextInt();
		}

		String result = "";

		for(int i = 1; i < rep.length; i++){
			if(rep[i] == rep[i - 1] + 1) result = "ascending";
			else if(rep[i] == rep[i - 1] - 1) result = "descending";
			else{
				result = "mixed";
				break;
			}
		}

		System.out.println(result);

		sc.close();

    }

}
