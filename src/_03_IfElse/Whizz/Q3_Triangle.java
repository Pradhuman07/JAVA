package _03_IfElse.Whizz;

import java.util.Scanner;

public class Q3_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sides of the Triangle: ");

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a==b && b==c) System.out.println("Equilateral Triangle");
        else if (a!=b && b!=c  && a!=c) System.out.println("Scalene Traingle");
        else System.out.println("Isosceles Triangle");

//        if(a==b && b==c) System.out.println("Equilateral Triangle");
//        else if((a==b && b!=c) || (b==c && a!=b) || (c==a && a!=b)) System.out.println("ISOSCELES Triangle");
//        else System.out.println("Scalene Triangle");
    }
}
