import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        while(n.hasNextLine()){
            String str = n.nextLine();
            System.out.println(str);
        }

        n.close();

    }
}
