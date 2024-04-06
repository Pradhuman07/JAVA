// 18. Accept 3 numbers and print the greatest between them
package _03_IfElse.EQ_12To22;
import java.util.Scanner;
public class EQ18_M3_LYW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:- ");

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a>b){
            if(a>c) System.out.println(a + " is greatest");
            else System.out.println(c + " is greatest");
        }

        else if(b>c) System.out.println(b + " is greatest ");

        else System.out.println(c + " is greatest");
    }
}
