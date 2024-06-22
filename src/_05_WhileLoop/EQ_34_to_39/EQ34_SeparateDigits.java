package _05_WhileLoop.EQ_34_to_39;
import java.util.Scanner;
public class EQ34_SeparateDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();   //123

        while(n>0){
            System.out.println(n%10);  //3
            n/=10;  //12
        }
    }
}
//1%10 = 1 since Nr%Dr = Nr Only if Nr<Dr