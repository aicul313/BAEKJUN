import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        
        int N = n.nextInt();
      
        int[][] time = new int[N][2];
      
        for(int i=0; i<N; i++){
            time[i][0] = n.nextInt();
            time[i][1] = n.nextInt();
        }
      
      
        Arrays.sort(time, new Comparator<int[]>(){
            public int compare(int[] a1, int[] a2){
                if(a1[1] == a2[1]){
                    return a1[0] - a2[0];
                }
              
                return a1[1] - a2[1];
            }
        });
      
        int cnt = 0;
        int e_time = 0;
      
        for(int i=0; i<N; i++){
            if(e_time <= time[i][0]){
                e_time = time[i][1];
                cnt++;
            }
        }
      
        System.out.println(cnt);

    }
}
