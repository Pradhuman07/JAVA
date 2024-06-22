//27- Sum from 1 to n.
package _04_ForLoop.EQ_23_to_33;
import java.util.Scanner;
public class EQ27_Sn_Accumulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();

        int sum=0;   //Accumulator for summation is sum=0

        for(int i=1 ; i<=n ; i++){
            sum+=i;                  //accumulate krte jaenge
        }

        System.out.println(sum);
    }
}
