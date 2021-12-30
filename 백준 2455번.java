import java.util.*;
//import java.io.*;

public class Main{

    public static void main(String[] args) {
    
		Scanner sc= new Scanner(System.in);

		int people = 0;

		int[] p = new int[4];

		for(int i=0; i<4; i++){
			int GetOff = sc.nextInt();
			int GetOn = sc.nextInt();

			people = people + GetOn - GetOff;
			p[i] = people;
		}

		int max = 0;

		for(int i=0; i<4; i++){
			if(p[i]>max){
				max = p[i];
			}
		}

		System.out.println(max);

		sc.close();

    }

}
