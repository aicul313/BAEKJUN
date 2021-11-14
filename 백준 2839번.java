import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
      
        int N = n.nextInt();
        int x = 0;

        if(3 <= N && N <= 5000) {
          
            while(true){
                if(N%5 == 0){
                    System.out.println(N/5+x);
                    break;
                } else if(N<=0){
                    System.out.println(-1);
                    break;
                }
              
              N -= 3;
              x++;
            }
          
        } else {
        
            System.out.println(-1);
          
        }

        n.close();

    }
}
