package JAVA._03_IfElse.Whizz;

import java.util.*;
public class Q4_AlphaOrNumOrSpChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");
        char c = sc.next().charAt(0);


        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is an alphabet.");
        }
        else if (c >= '0' && c <= '9') {
            System.out.println(c + " is a number.");
        }
        else {
            System.out.println(c + " is a special character.");
        }
    }
}

