//30- Print all the factors of a number.
package JAVA._04_ForLoop.EQ_23_to_33;
import java.util.Scanner;
public class EQ30_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The factors of " + n + " are: ");

        for(int i=1 ; i<n ; i++)
            if(n%i==0)
                System.out.println(i);
    }
}