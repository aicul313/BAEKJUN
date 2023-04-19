import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        String[] array = br.readLine().split(" ");
        for(int i=0; i<num; i++){
            Integer.parseInt(array[i]);
        }
        int find = Integer.parseInt(br.readLine());  
        int sum = 0;

        for(int i=0; i<num; i++){
            if(Integer.parseInt(array[i]) == find) sum++;
        }

        System.out.println(sum);

    }
}
