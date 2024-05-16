package _08_PatternPrinting._05_CT;
import java.util.Scanner;
public class _03_IRAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:-");
        int n=sc.nextInt();

        for(int i=0 ; i<n ; i++){

            for(int j=0 ; j<=i ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

// * 
// * * 
// * * * 
// * * * * 
// * * * * * 