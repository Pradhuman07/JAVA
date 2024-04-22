//33- Write a program to take two inputs a, b & find the value of a  raised to the power of b.
//          Ex - a = 2, b = 5
//          OP - 2^5 = 32
package _04_ForLoop.EQ_23_to_33;
import java.util.Scanner;
public class EQ33_MathPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        System.out.print("Enter Power: ");
        int b = sc.nextInt();


        int product = 1;

        for(int i=1 ; i<=b ; i++)
            product=product*a;


        System.out.print(a+"^"+b+"=" + product);
    }
}
