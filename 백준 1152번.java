import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        String sentence = n.nextLine().trim();
        int cnt = 1;

        n.close();

        if(sentence.isEmpty()){
            System.out.println("0");
        }
        else{
            System.out.println(sentence.split(" ").length);
        }
        
    }

}
