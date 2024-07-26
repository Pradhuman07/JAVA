package JAVA._01_Basics.EQ_1To6;

import java.util.Scanner;

public class EQ7_CharacterInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Gender m/f :-");

        char ch = sc.nextLine().charAt(0);

        System.out.println(ch=='m' ? "male" : "female");
    }
}
