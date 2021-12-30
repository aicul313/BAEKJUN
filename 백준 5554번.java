import java.util.*;
//import java.io.*;

public class Main{

    public static void main(String[] args) {
    
		Scanner sc= new Scanner(System.in);

		int HtoS = sc.nextInt();
		int StoP = sc.nextInt();
		int PtoA = sc.nextInt();
		int AtoH = sc.nextInt();

		int x = 0;
		int y = 0;

		int minute = HtoS + StoP + PtoA + AtoH;

		x = minute / 60;
		y = minute % 60;

		System.out.println(x);
		System.out.println(y);

		sc.close();

    }

}
