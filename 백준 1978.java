import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException{

        Scanner n = new Scanner(System.in);

        int cnt;
        int total_cnt = 0;

        int num = n.nextInt();
        int[] nums = new int[num];

        for(int i=0; i<nums.length; i++){
            nums[i] = n.nextInt();
        }

        for(int i=0; i<nums.length; i++){

            cnt = 0;
            
            for(int j=2; j<nums[i]; j++){

                if(nums[i]%j==0){
                    cnt++;
                }

            }

            if(cnt==0 && nums[i] != 1){
                total_cnt++;
            }

        }

        System.out.println(total_cnt);

    }
}
