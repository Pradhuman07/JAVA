//17- Accept a day number between 1-7 and print the corresponding dayname.
package _03_IfElse.EQ_12To22;
import java.util.Scanner;
public class EQ17_WeakDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day no. ");
        int n = sc.nextInt();

        if(n%7==1) System.out.println("Monday");
        else if(n%7==2) System.out.println("Tuesday");
        else if(n%7==3) System.out.println("Wednesday");
        else if(n%7==4) System.out.println("Thursday");
        else if(n%7==5) System.out.println("Friday");
        else if(n%7==6) System.out.println("Saturday");
        else if(n%7==0) System.out.println("Sunday");

        //Remember if Nr<Dr then Nr%Dr=Nr always
        //2%7 = 2
    }
}
