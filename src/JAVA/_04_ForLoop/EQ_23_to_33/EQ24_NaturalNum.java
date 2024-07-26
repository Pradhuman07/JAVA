//24- Print natural number up to n.
package JAVA._04_ForLoop.EQ_23_to_33;
import java.util.Scanner;
public class EQ24_NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Natural number upto " + n + " are:- ");

        for (int i = 1; i <= n ; i++) {
            System.out.println(i);
        }
    }
}
