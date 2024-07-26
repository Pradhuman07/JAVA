//28- Print the sum of all even & odd numbers in a range separately.
package JAVA._04_ForLoop.EQ_23_to_33;
import java.util.Scanner;
public class EQ29_Range_EvenOdd_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:- ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sumOfEven=0;
        int sumOfOdd=0;

        for(int i=Math.min(a,b) ; i<=Math.max(a,b) ; i++){
            if(i%2==0) sumOfEven += i;
            else sumOfOdd += i;
        }

        System.out.println("Sum of Even numbers b/w " + a + " and " + b + " is:- " + sumOfEven);
        System.out.println("Sum of Odd numbers b/w " + a + " and " + b + " is:- " + sumOfOdd);
    }
}