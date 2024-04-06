//NOTE:- no(?)=no(:)
package _03_IfElse.TernaryOperator;
import java.util.Scanner;

public class Q2_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Shopping Amount: ");
        int tot = sc.nextInt();

//        if(tot<5000) dis = 0;
//        else if(tot>5000 && tot<7000) dis = 10.00/100;
//        else if(tot>7000 && tot<10000) dis = 20.00/100;
//        else dis = 30.00/100;

        double dis = tot>5000 && tot<7000 ? 10.00/100 : tot>7000 && tot<10000 ? 20.00/100 : tot>10000 ? 30.00/100 : 0 ;

        System.out.println("Your discount is: " + dis*tot);
        System.out.println("Therefore Amount to be paid is: " + (tot-(dis*tot)));
    }
}
