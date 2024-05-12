//39- Automorphic number:- (5,2"5") (25,6"25") (6,3"6")

package _05_WhileLoop.EQ_34_to_39;
import java.util.Scanner;
public class EQ39_Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int n= sc.nextInt();      //25
        int dup=n;
        int countOfDigits = 0;

        while(n>0){
            countOfDigits++;   //2
            n/=10;
        }

        n=dup;

        int square = n*n;   //625

        int lastDigitsOfSquare = (int) (square % Math.pow(10,countOfDigits));   //625%(10^2) = 25 = n

        System.out.println("Number is: " + n);
        System.out.println("Count of Digits is: " + countOfDigits);
        System.out.println("Square is: " + square);
        System.out.println("Last "+ countOfDigits + " Digits of " + square + " is: " + lastDigitsOfSquare);

        System.out.println(lastDigitsOfSquare==n ? "Therefore Auto" : "Therefore Not Auto");
    }
}
