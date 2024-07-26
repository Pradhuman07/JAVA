//11- Find circumference and area of circle
package JAVA._02_Math.EQ_7To11;
import java.util.Scanner;
public class EQ11_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = sc.nextDouble();

        System.out.println("Circumference is :- " + 2*Math.PI*r);
        System.out.println("Area is :- " + Math.PI*r*r);
    }
}
