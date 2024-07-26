//29- Factorial of a number
package JAVA._04_ForLoop.EQ_23_to_33;
import java.util.Scanner;
public class EQ28_Factorial_ProductAccumulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int product = 1;   //Accumulator for Product
        for(int i=1; i<=n ; i++){
            product *= i;
        }
        System.out.println(product);
    }
}

