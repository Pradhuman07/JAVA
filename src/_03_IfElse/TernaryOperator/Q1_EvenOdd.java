//Syntax:- condition ? true : false ;      NOTE:- no(?)=no(:)
//Note:- Ternary Operator returns a value therefore you need a variable to store it, and also you have to define the datatype of that variable
package _03_IfElse.TernaryOperator;
import java.util.Scanner;
public class Q1_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();

        if(n%2==0) System.out.println("Even");
        else System.out.println("Odd");

        String ans = n%2==0 ? "Even" : "Odd";
        System.out.println(ans);

        System.out.println(n%2==0 ? "Even" : "Odd");
    }
}
