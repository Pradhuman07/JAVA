package _02_IfElse;
import java.util.Scanner;
public class _01_Gender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Gender:");
        char gender = sc.next().charAt(0);

        if(gender == 'M' || gender == 'm'){
            System.out.println("Good Morning Sir");
        }
        else if(gender == 'F' || gender == 'f'){
            System.out.println("Good Morning Mam");
        }
        else{
            System.out.println("Wrong");
        }
    }
}
