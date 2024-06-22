//39- Automorphic number:- (5,2"5") (25,6"25") (6,3"6")
package _05_WhileLoop.EQ_34_to_39;
import java.util.Scanner;
public class EQ39_Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int n= sc.nextInt();      //25
        int square = n*n;   //625

        int countOfDigits = (int) Math.log10(n) + 1;

        int lastDigitsOfSquare = (int) (square % Math.pow(10,countOfDigits));   //625%(10^2) = 25 = n

        System.out.println(lastDigitsOfSquare==n ? "Therefore Auto" : "Therefore Not Auto");
    }
}
