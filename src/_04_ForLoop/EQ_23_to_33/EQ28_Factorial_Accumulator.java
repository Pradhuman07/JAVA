//29- Factorial of a number
package _04_ForLoop.EQ_23_to_33;
import java.util.Scanner;
public class EQ28_Factorial_Accumulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("The Factorial of " + n + " is = ");

        int product = 1;   //Accumulator for Product

        for (int i = n; i >= 1; i--) {
            product = product * i;
        }
        System.out.println(product);

    // n * n-2 * n-3 * .... * 1 == 1 * 2 * 3 * ..... *n

        product = 1;

        for(int i=1; i<=n ; i++){
            product = product*i;
        }
        System.out.println(product);
    }
}

