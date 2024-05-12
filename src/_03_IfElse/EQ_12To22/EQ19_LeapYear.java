//19- Accept a year and check if it a leap year or not.
package _03_IfElse.EQ_12To22;
import java.util.Scanner;
public class EQ19_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();

        if( (year%4==0 && year%100!=0) || year%400==0 ) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
    }
}
//        if(year%4==0) {
//            if(year%100!=0) System.out.println("Leap Year");
//            else if(year%400==0) System.out.println("Leap Year");
//            else System.out.println("Not a Leap Year");
//        }
//        else System.out.println("Not a Leap year");
