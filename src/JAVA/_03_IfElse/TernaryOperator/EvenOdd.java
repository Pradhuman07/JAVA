//Syntax:- Condition ? true : false ;      NOTE:- no(?)=no(:)
//Note:- Ternary Operator returns a value therefore you need a variable to store it, and also you have to define the datatype of that variable
//String is not the only one you can store int and other datatype also
package JAVA._03_IfElse.TernaryOperator;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();

        System.out.println(n%2==0 ? "Even" : "Odd");    //Best

        String ans = n%2==0 ? "Even" : "Odd";
        System.out.println(ans);
    }
}
