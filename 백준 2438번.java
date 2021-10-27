import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int userInputNumber = n.nextInt();

        int lineCount = userInputNumber;
        int starCount = 1;

        for(int i=0; i<lineCount; i++){
            for(int j=0; j<starCount; j++){
                System.out.print("*");
            }
            starCount += 1;
            System.out.println();
        }

    }
}
