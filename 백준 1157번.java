import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        int array[] = new int[26];
        int max = -1;
        int element = 0;

        String word = n.next();

        n.close();

        word = word.toUpperCase(); //대소문자 구분 X

        for(int i=0; i<word.length(); i++){
            
            array[(word.charAt(i)-65)]++;

        }

        for(int i=0; i<26; i++){

            if(max < array[i]){
                max = array[i];
                element = i;
            }
            else if(max == array[i]){
                element = -1;
            }

        }

        if(element == -1){
            System.out.println("?");
            System.exit(0);
        }
        System.out.println((char)(element+65));

        
    }

}
