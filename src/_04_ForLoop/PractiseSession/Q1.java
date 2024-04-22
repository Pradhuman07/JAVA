//ISBN no. is i) of 10 digits
//           ii) the sum of digits of that no. multiplied by their position no. should be divisible by 11

package _04_ForLoop.PractiseSession;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt(); //1401601499
        int count = ((int) Math.log10(n) + 1);  //or use while loop
        int sum = 0;

        if (count != 10) System.out.println("Illegal");

        else {
            while (n > 0) {
                sum = sum + (n % 10) * count;
                count--;
                n /= 10;
            }

            System.out.println(sum % 11 == 0 ? "Legal" : "Illegal");
        }
    }
}