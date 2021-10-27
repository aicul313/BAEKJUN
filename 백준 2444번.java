import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int userInputNumber = n.nextInt();

        int lineCount = userInputNumber*2-1;
        int starCount = 1;
        int spaceCount = userInputNumber - 1;

        for(int i=0; i<lineCount; i++){
            for(int j=0; j<spaceCount; j++){
                System.out.print(" ");
            }
            for(int j=0; j<starCount; j++){
                System.out.print("*");
            }

            if(i>lineCount/2-1){
                spaceCount += 1;
                starCount -= 2;
            }
            else{
                spaceCount -= 1;
                starCount += 2;
            }
            
            System.out.println();
            
        }
        n.close();
    }
}
