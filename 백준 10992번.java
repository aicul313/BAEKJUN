import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int userInputNumber = n.nextInt();

        int lineCount = userInputNumber;
        int starCount = 1;
        int leftspaceCount = lineCount - 2 ;
        int midspaceCount = 1;

        for(int i=0; i<lineCount-1; i++){

            if(i>0){
                for(int j=0; j<leftspaceCount; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<starCount; j++){
                    System.out.print("*");
                }
                for(int j=0; j<midspaceCount; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<starCount; j++){
                    System.out.print("*");
                }
                
                leftspaceCount -= 1;
                midspaceCount += 2;

            }
            else{
                for(int j=0; j<lineCount-1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }

           System.out.println();

        }

        for(int i=0; i<lineCount*2-1; i++){
            System.out.print("*");
        }

        n.close();
    }
}
