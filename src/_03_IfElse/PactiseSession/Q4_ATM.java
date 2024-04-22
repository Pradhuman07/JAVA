package _03_IfElse.PactiseSession;
import java.util.Scanner;
// Special powers of / & % by powers of 10
// #(/) to reduce the number
// #(%) to get last digit(s) of number
public class Q4_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        int amt = sc.nextInt(); //4388

        if(amt/500 > 0) {
            System.out.println("No. of 500 Rs Notes = " + amt/500);
            amt=amt%500;   //500 se divide krne ke baad jitna bacha
        }
        if(amt/200 > 0) {
            System.out.println("No. of 200 Rs Notes = " + amt/200);
            amt=amt%200;   //200 se divide krne ke baad jitna bacha
        }
        if (amt / 100 > 0) {
            System.out.println("No. of 100 Rs Notes = " + amt / 100);
            amt = amt % 100;
        }
        if (amt / 50 > 0) {
            System.out.println("No. of 50 Rs Notes = " + amt / 50);
            amt = amt % 50;
        }
        if (amt / 20 > 0) {
            System.out.println("No. of 20 Rs Notes = " + amt / 20);
            amt = amt % 20;
        }
        if (amt / 10 > 0) {
            System.out.println("No. of 10 Rs Notes = " + amt / 10);
            amt = amt % 10;
        }
        if (amt / 5 > 0) {
            System.out.println("No. of 5 Rs Notes = " + amt / 5);
            amt = amt % 5;
        }
        if (amt / 2 > 0) {
            System.out.println("No. of 2 Rs Notes = " + amt / 2);
            amt = amt % 2;
        }
        if (amt > 0) {
            System.out.println("No. of 1 Rs Notes = " + amt);
        }

    }
}
