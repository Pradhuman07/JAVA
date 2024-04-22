//32- Check if the number is Prime or not.
package _04_ForLoop.EQ_23_to_33;
import java.util.Scanner;
public class EQ32_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");

        int num = sc.nextInt();
        int countOfFactors = 0;


        for (int i=1 ; i<=num ; i++)
            if(num%i==0) countOfFactors++;
        System.out.println(countOfFactors==2 ? "Prime" : "Not Prime");
    }
}
