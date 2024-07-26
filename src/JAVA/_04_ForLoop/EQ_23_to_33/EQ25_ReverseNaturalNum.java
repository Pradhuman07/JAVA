//25- Reverse for loop. Print n to 1.
package JAVA._04_ForLoop.EQ_23_to_33;
import java.util.Scanner;
public class EQ25_ReverseNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Numbers from " + n + " to 1 are:- ");

        for (int i=n ; i>=1 ; i--) {
            System.out.println(i);
        }
    }
}
