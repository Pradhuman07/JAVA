//12- Accept two numbers and print the greatest between them
package _03_IfElse.EQ_12To22;

import java.util.Scanner;

public class EQ12_MaxNoBw2 {
    public static void main(String[] args) {

//      System.out.println("Max no. b/w " + a + " and " + b + " is " + Math.max(a,b));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Max no. b/w " + a + " and " + b + " is:");

        if(a>b) System.out.println(a);
        else System.out.println(b);
    }
}
