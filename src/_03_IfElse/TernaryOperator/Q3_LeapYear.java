package _03_IfElse.TernaryOperator;

import java.util.Scanner;

public class Q3_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year");
        int year = sc.nextInt();

//        if(year%400==0 || (year%4==0 && year%100!=0)) System.out.println("Leap Year");
//        else System.out.println("Not a Leap Year");

        String ans = (year%400==0 || (year%4==0 && year%100!=0)) ? "Leap Year" : "Not a Leap Year" ;
        System.out.println(ans);

    }
}
