//38- Accept a number and check if it is a strong number or not
// (No.= Sum of factorial of each digit)
//Ex- 145 = 1! + 4! + 5! = 145
package _05_WhileLoop.EQ_34_to_39;

import java.util.Scanner;

public class EQ38_Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int n = sc.nextInt();  //145
        int dup = n;

        int sumOfFactorials = 0;
        while (n > 0) {
            int lastDigit = n % 10;    //Digit Separtion using While Loop
            int factorial = 1;    //Factorial of that digit using For Loop
            for (int i = 1; i <= lastDigit; i++) {
                factorial = factorial * i;
            }
            sumOfFactorials = sumOfFactorials + factorial;   //Accumulating the Sum of factorials of digits
            n /= 10;
        }
        System.out.println(sumOfFactorials == dup ? "Strong" : "Not Strong");
    }
}
//NOTE:- Also do this Question using Method