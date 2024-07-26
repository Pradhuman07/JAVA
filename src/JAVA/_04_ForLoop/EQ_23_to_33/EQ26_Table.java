//26- Take a number as input and print its table
//        5 * 1 = 5
//        5 * 2 = 10
package JAVA._04_ForLoop.EQ_23_to_33;
import java.util.Scanner;
public class EQ26_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        System.out.println("The table of " + n + " is as follows:- ");
        for (int i=1; i<=10 ; i++) {
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
}