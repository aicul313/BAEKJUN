import java.util.*;
//import java.io.*;

public class Main{

    public static void main(String[] args) {
    
		Scanner sc= new Scanner(System.in);

		int day = sc.nextInt();
		int car[] = new int[5];
		int cnt = 0;

		for(int i=0; i<5; i++){
			car[i] = sc.nextInt();
		}

		for(int i=0; i<5; i++){
			if((car[i] % 10) == day)
				cnt++;
		}

		System.out.println(cnt);

		sc.close();

    }

}
