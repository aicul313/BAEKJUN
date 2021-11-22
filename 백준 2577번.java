import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner n = new Scanner(System.in);
        int num1 = n.nextInt();
        int num2 = n.nextInt();
        int num3 = n.nextInt();

        n.close();

        int mul = num1 * num2 * num3;

        int[] arr = new int[10];
        while(mul>0){
            arr[mul%10]++;
            mul /= 10;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
}
