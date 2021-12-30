import java.util.*;
//import java.io.*;

public class Main{

    public static void main(String[] args) {
    
		Scanner sc= new Scanner(System.in);

		int N = sc.nextInt();

		int cnt =0;
		
		for(int i=1; i<N+1; i++){
			int a = i / 100;
			int b = (i / 10) % 10;
			int c = i % 10;

			if(i < 100)
				cnt++;
			else
				if((a-b) == (b-c))
					cnt++;
		}

		System.out.println(cnt);

		sc.close();

    }

}
