import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        int y = n.nextInt();

        n.close();

        if(x>0 && y>0){
            System.out.println("1");
        }else if(x<0 && y>0){
            System.out.println("2");
        }else if(x<0 && y<0){
            System.out.println("3");
        }else{
            System.out.println("4");
        }

    }
}
