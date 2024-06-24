package _11_JCM.JCM1;
import java.util.Scanner;
public class B2_TargetElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array A: ");

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element at index " + i);
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the value of X: ");
        int X = sc.nextInt();

        int count=0;

        for (int i = 0; i < A.length; i++)
            if(A[i]<=X)
                count++;

        System.out.println(count);
    }
}