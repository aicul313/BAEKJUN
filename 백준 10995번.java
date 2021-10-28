import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {

        Scanner n = new Scanner(System.in);
        int userInputNumber = n.nextInt();

        int lineCount = userInputNumber;


        for(int i=0; i<lineCount; i++){

            if(i%2==0){
                for(int j=0; j<lineCount; j++){
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println();
            }else{
                for(int j=0; j<lineCount; j++){
                    System.out.print(" ");
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        
        n.close();
    }
}
