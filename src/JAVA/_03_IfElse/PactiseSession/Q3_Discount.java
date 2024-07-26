package JAVA._03_IfElse.PactiseSession;
import java.util.Scanner;
public class Q3_Discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int amt = sc.nextInt();
        double dis;

        if(amt<5000) dis = 0.0/100 ;
        else if(amt<7000) dis = 10.00/100;
        else if(amt<10000) dis = 20.00/100;
        else dis = 30.00/100;

        System.out.println("Your discount is: " + (dis*amt));
        System.out.println("You have to pay Rs " + (amt-(dis*amt)));
    }
}