package JAVA._11_JCM.JCM1;
import java.util.Scanner;
public class A3_AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int sumOfFactors = 0;

        for(int i=1; i<n ; i++)
            if(n%i==0)
                sumOfFactors+=i;

        System.out.println(sumOfFactors>n ? "Yes, it's an Abundant Number" : "No, it's not an Abundant Number");
    }
}