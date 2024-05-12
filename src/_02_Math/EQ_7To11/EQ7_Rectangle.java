//7- Accept the length and width of a rectangle. Calculate & print the area and perimiter.
package _02_Math.EQ_7To11;
import java.util.Scanner;
public class EQ7_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length:");
        double l=sc.nextDouble();

        System.out.print("Enter breadth:");
        double b = sc.nextDouble();

        double perimeter = 2 * (l+b);
        double area = l * b;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
