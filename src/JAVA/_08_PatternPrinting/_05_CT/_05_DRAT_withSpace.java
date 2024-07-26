package JAVA._08_PatternPrinting._05_CT;
import java.util.Scanner;
public class _05_DRAT_withSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:-");
        int n=sc.nextInt();

        for(int i=0; i<n ; i++){

            for(int s=1 ; s<=i ; s++){
                System.out.print("  ");
            }

            for(int j=0; j<n-i ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
// * * * * * 
// s * * * * 
// s s * * * 
// s s s * * 
// s s s s * 