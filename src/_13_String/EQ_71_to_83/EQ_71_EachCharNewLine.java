//71- Accept a string from user and print its each character on a new line
package _13_String.EQ_71_to_83;
import java.util.Scanner;
public class EQ_71_EachCharNewLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String value");
        String s = sc.nextLine();

        for (int i=0; i<s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
