//4- Accept the User's name, age and print in following manner
//Ex - Hello Shery, you are 12 years old.
package JAVA._01_Basics.EQ_1To6;

import java.util.Scanner;

public class EQ4_NamenAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:- ");
        String name = sc.nextLine();

        System.out.println("Enter your Age:- ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
//Note age phle leo naam baadme fir glitch dkho
