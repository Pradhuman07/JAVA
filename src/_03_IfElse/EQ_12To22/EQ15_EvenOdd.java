//15- Accept an integer and check whether it is an even number or odd.
package _03_IfElse.EQ_12To22;
import java.util.Scanner;
public class EQ15_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        if (n%2==0) System.out.println(n + " is a Even Number");
        else System.out.println(n + " is a Odd Number");

        System.out.println(n%2==0 ? "Even" : "Odd");
    }
}
