/*
 100 unit tk 4.2 Rs
 100-200 unit mein 6
 200-400 unit mein 8
 >400 mien 13
*/
package JAVA._03_IfElse.EQ_12To22;
import java.util.Scanner;
public class EQ21_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of units consumed");

        double u = sc.nextInt();
        double tot=0;

        if(u>400){
            tot = (u-400)*13;
            u=400;
        }

        if(u>200){
            tot = tot + (u-200)*8;
            u=200;
        }

        if(u>100){
            tot = tot + (u-100)*6;
            u=100;
        }

        tot = tot + u*4.2;

        System.out.println("Your Bill is Rs " + tot);
    }
}
