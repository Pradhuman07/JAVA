package _03_IfElse.Whizz;

import java.util.Scanner;

public class Q2_ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount Invested");
        int inv = sc.nextInt();
        System.out.println("Amount Reached");
        int reach = sc.nextInt();

        if(reach>inv) System.out.println("Profit of Rs " + (reach-inv));
        else System.out.println("Loss of Rs " + (inv-reach));
    }
}
