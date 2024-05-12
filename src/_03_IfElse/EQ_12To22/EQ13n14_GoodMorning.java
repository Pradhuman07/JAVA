//13- Accept the gender from the user as char and print the respective greeting message
//Ex - Good Morning Sir (on the basis of gender)
//14- Extend the previous program and handle the wrong inputs.
//Print Good Morning sir for input m or M & Good morning Mam for input F or f
//      else print Wrong Input
package _03_IfElse.EQ_12To22;
import java.util.Scanner;
public class EQ13n14_GoodMorning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Gender: ");
        char gen = sc.next().charAt(0);   //Basically String is nothing but an Array of Char datatype

        if(gen == 'm' || gen == 'M') System.out.println("Good Morning Sir");
        else if(gen == 'f' || gen == 'F') System.out.println("Good Morning Mam");
        else System.out.println("Kya dikkt h bhai");
    }
}
