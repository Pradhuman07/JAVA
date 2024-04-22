package _05_WhileLoop.EQ_34_to_39;
import java.util.Scanner;
public class EQ35_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n=sc.nextInt();   //123
        int sum=0;

        while(n>0){
            sum=sum+n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}