package JAVA._04_ForLoop.PractiseSession;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        System.out.println("Enter 2 no.s: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();  //n1
        int n2 = sc.nextInt();  //n2

        System.out.println("Highest Common Factor is: ");
        for (int i = Math.min(n1, n2); i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
//Idr time complexity is O(jo chota no. h)   [0=Worst Case]
