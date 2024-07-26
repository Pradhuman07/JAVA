//43- Accept an english alphabet from user and check if it is a consonant or a vowel.
package JAVA._07_Switch;
import java.util.Scanner;
public class EQ43_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Alphabet:");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a','e','i','o','u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
