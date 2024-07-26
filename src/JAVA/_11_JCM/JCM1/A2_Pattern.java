package JAVA._11_JCM.JCM1;
import java.util.Scanner;
public class A2_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n= sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0) System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1