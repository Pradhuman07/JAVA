package _08_PatternPrinting._05_CT;
import java.util.Scanner;
public class _06_IRAT_withSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:-");
        int n=sc.nextInt();

        for(int i=0 ; i<n ;i++){

            for(int s=0 ; s<(n-i)-1 ; s++){
                System.out.print("  ");
            }

            for(int j=0 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// s s s s *
// s s s * *
// s s * * *
// s * * * *
// * * * * *
