import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        String word = n.nextLine();
        int[] Word = new int[word.length()];

        for(int i=0; i<word.length(); i++){
            Word[i] = word.charAt(i);
        }
        
        int[] alpha = new int[26];

        for(int i=0; i<Word.length; i++){
            alpha[Word[i] - 'a']+=1;
        }

        for(int i=0; i<alpha.length; i++){
            System.out.print(alpha[i]);
            System.out.print(" ");
        }

    }

}
