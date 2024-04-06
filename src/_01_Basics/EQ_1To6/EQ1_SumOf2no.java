package _01_Basics.EQ_1To6;

import java.util.Scanner;

//1 - Sum of two integers
public class EQ1_SumOf2no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no.s :- ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The sum is: " + (a+b));
    }
}
