//22- Accept an english alphabet from user and check if it is a consonent or a vowel.
package JAVA._03_IfElse.EQ_12To22;
import java.util.Scanner;
public class EQ22_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') System.out.println("Vowel");
        else System.out.println("Consonant");
    }
}
