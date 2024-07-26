package JAVA._03_IfElse.PactiseSession;
import java.util.Scanner;
// Special powers of / & % by powers of 10
// #(/) to reduce the number
// #(%) to get last digit(s) of number
public class Q4_NoOfNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        int amt = sc.nextInt(); //4278

        if(amt/500 > 0) {
            System.out.println("No. of 500 Rs Notes = " + amt/500);     //8
            amt=amt%500;   //500 se divide krne ke baad jitna bacha     //278
        }
        if(amt/200 > 0) {
            System.out.println("No. of 200 Rs Notes = " + amt/200);     //1
            amt=amt%200;   //200 se divide krne ke baad jitna bacha     //78
        }
        if (amt / 100 > 0) {                                            //No
            System.out.println("No. of 100 Rs Notes = " + amt / 100);   //0
            amt = amt % 100;
        }
        if (amt / 50 > 0) {
            System.out.println("No. of 50 Rs Notes = " + amt / 50);     //1
            amt = amt % 50;                                             //28
        }
        if (amt / 20 > 0) {
            System.out.println("No. of 20 Rs Notes = " + amt / 20);     //1
            amt = amt % 20;                                             //8
        }
        if (amt / 10 > 0) {                                             //No
            System.out.println("No. of 10 Rs Notes = " + amt / 10);     //0
            amt = amt % 10;
        }
        if (amt / 5 > 0) {
            System.out.println("No. of 5 Rs Notes = " + amt / 5);       //1
            amt = amt % 5;                                              //3
        }
        if (amt / 2 > 0) {                                              //1
            System.out.println("No. of 2 Rs Notes = " + amt / 2);       //1
            amt = amt % 2;
        }
        if (amt > 0) {
            System.out.println("No. of 1 Rs Notes = " + amt);           //1
        }

    }
}
