import java.util.*;
//import java.io.*;

public class Main{

    public static void main(String[] args) {
    
		Scanner sc= new Scanner(System.in);

		int T = sc.nextInt();
		int floor = 0;
		int room = 0;

		for(int i=0; i<T; i++){
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			floor = N % H;
			room = N / H;

			if(floor == 0){
				System.out.println(H * 100 + room);
			}else{
				System.out.println(floor * 100 + room + 1);
			}

		}

		sc.close();

    }

}
