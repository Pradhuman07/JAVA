//31- Print the sum of all factors of a number, 50 -> 1 + 2 + 5 + 10 + 25 = 43
package _04_ForLoop.EQ_23_to_33;
import java.util.Scanner;
public class EQ31_SumOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int n = sc.nextInt();
        int sum = 0;

        System.out.println("The sum of all factors are: ");

        for(int i=1 ; i<=n ; i++)
            if(n%i==0) sum+=i;

        System.out.println(sum);
    }
}
