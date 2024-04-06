//8-Calculate the Compound Interest & print it on STDOUT (Use Math class methods)
//Formula:- A = P(1+r/100)^n
package _02_Math.EQ_7To11;
import java.util.Scanner;
public class EQ8_CI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount:- ");
        int P = sc.nextInt();

        System.out.print("Enter No. of years:- ");
        int n = sc.nextInt();

        System.out.print("Enter Rate of Interest:- ");
        double r = sc.nextDouble();

        double A = P * Math.pow((1+r/100),n);

        System.out.println("Amount = " + A);
    }
}

