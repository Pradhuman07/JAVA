//2- Print the messege along with values and sum
//Ex - The sum of 45 & 12  = 57
package JAVA._01_Basics.EQ_1To6;

import java.util.Scanner;

public class EQ2nQ3_WithMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no.s :- ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The sum of " + a + " & " + b + " is: " + (a+b));
    }
}
