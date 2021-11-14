import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
      
        int coincnt = n.nextInt();
        int money = n.nextInt();
      
        int[] coin = new int[coincnt];
      
        for(int i=0; i<coincnt; i++){
          coin[i] = n.nextInt();
        }
      
      
        int i = coincnt - 1;
        int cnt = 0;
      
        while(money != 0){
          
            if(coin[i] <= money){
                cnt += (money / coin[i]);
                money = money % coin[i];
            }
          
            i--;
          
        }
      
        System.out.println(cnt);

    }
}
