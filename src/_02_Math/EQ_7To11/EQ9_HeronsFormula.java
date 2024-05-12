//9- Accept the three sides of triangle and calculate the area using herons formula
                // A = ✔S(S-a)(S-b)(S-c)
                // where S = (a+b+c)/2
package _02_Math.EQ_7To11;
import java.util.Scanner;
public class EQ9_HeronsFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sides a,b,c:- ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double S = (a+b+c)/2;
        System.out.println(S);
        double Area = Math.sqrt(S*(S-a)*(S-b)*(S-c));

        System.out.println("Area = " + Area);
        
    }
}
