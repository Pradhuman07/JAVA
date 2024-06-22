package _05_WhileLoop.EQ_34_to_39;
import java.util.Scanner;
public class EQ36_ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n=sc.nextInt();   //123 = 100 + 20 + 3
        int rev=0;            //321 = 300 + 20 + 1
//                                    3*10*10 + 2*10 + 1

        while(n>0){     //n=123
            int lastDigit = n%10;
            rev = rev*10 + lastDigit;
            n/=10;
        }

        System.out.println(rev);
    }
}
