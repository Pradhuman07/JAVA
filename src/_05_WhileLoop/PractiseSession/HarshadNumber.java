package _05_WhileLoop.PractiseSession;
import java.util.Scanner;
public class HarshadNumber {  //Number divisible by its sum of digits
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n = sc.nextInt();  //18,27,40 etc
        int dup=n;

        int sum=0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        System.out.println(dup%sum==0 ? "Harshad" : "Not Harshad");
    }
}
