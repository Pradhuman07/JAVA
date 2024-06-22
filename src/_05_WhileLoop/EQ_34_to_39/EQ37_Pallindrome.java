package _05_WhileLoop.EQ_34_to_39;
import java.util.Scanner;
public class EQ37_Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");

        int n=sc.nextInt();   //123
        int dup = n;
        int rev = 0;

        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }

        System.out.println(rev==dup ? "Palli":"Not Palli");
    }
}
