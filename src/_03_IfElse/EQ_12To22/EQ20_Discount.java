/* Find the  amount after discount
    <5000 = No discount
    5000-7000 = 10% discount
    7000-10000 = 20% discount
    <10000 = 30% discount   */
package _03_IfElse.EQ_12To22;
import java.util.Scanner;
public class EQ20_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Shopping Amount: ");
        int tot = sc.nextInt();

        double dis;

        if(tot<5000) dis = 0;
        else if(tot<7000) dis = 10.00/100;
        else if(tot<10000) dis = 20.00/100;
        else dis = 30.00/100;

        System.out.println("Your discount is: " + (dis*tot) );
        System.out.println("Amount to be paid is: " + ( tot - (dis*tot) ) );
    }
}