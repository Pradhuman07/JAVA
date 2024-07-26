package JAVA._08_PatternPrinting._05_CT;
import java.util.Scanner;
public class _02_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of Rows and Column");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i=0 ; i<row ; i++){
            
            for(int j=0 ; j<col ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
