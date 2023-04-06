import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int totall_cost = Integer.parseInt(st.nextToken()); //총 금액
        st = new StringTokenizer(br.readLine());
        int GoodsType = Integer.parseInt(st.nextToken()); //물건 종류
        st = new StringTokenizer(br.readLine());

        int sum = 0;
        int result = 0;

        for (int i=0; i<GoodsType; i++)
        {
            int GoodsCost = Integer.parseInt(st.nextToken());
            int NumOfItem = Integer.parseInt(st.nextToken());
            
            sum = GoodsCost * NumOfItem;
            result = result + sum;

            if (i<GoodsType-1) st = new StringTokenizer(br.readLine());

        }

        if( result == totall_cost )
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
