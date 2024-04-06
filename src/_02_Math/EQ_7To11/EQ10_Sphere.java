//10- Find surface area of sphere
package _02_Math.EQ_7To11;
import java.util.*;
public class EQ10_Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of sphere:-");
        double r = sc.nextDouble();
        System.out.print("The Area of Sphere is:-");
        System.out.println(4*Math.PI*r*r);
    }
}
