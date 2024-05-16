package _08_PatternPrinting._05_CT;
import java.util.Scanner;
public class _04_DRAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows:-");
        int n=sc.nextInt();

        for(int i=0; i<n ; i++){

            for(int j=0 ; j<n-i ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

// * * * * * 
// * * * * 
// * * * 
// * * 
// * 