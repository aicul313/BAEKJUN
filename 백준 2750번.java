import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);

        int N = n.nextInt();
		int tmp=0;
		int arr[] = new int[N];

		for(int i=0;i<N;i++) {
			arr[i]=n.nextInt();
		}

		for(int i=0;i<arr.length;i++) {

			for(int j=i+1; j<arr.length; j++) {

				if(arr[i] > arr[j]) {
				    tmp = arr[i];
				    arr[i] = arr[j];
				    arr[j] = tmp;
				}

			}

		}

		for(int i=0; i<N; i++) {

			System.out.println(arr[i]);

		}

        n.close();

    }
}
