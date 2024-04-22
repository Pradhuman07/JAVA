package _05_WhileLoop.EQ_34_to_39;
import java.util.Scanner;
public class EQ34_Separate_But_Seedhe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");

        int n = sc.nextInt();
        int rev = 0 ;

        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }

        while(rev>0){
            System.out.println(rev%10);
            rev/=10;
        }
    }
}
