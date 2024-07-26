package JAVA._03_IfElse.PactiseSession;
import java.util.Scanner;
public class Q2_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ur Gender M/F: ");
        char gen = sc.next().charAt(0);

        System.out.println("Enter your Year of Service: ");
        int n = sc.nextInt();

        System.out.println("Enter your Qualification(G/PG): ");
        char Q = sc.next().charAt(0);

        if(gen == 'M') {
            if (n<10){
                if (Q=='G') System.out.println(7000);
                else System.out.println(10000);
            }
            else{
                if (Q=='G') System.out.println(10000);
                else System.out.println(15000);
            }
        }

        else if(gen == 'F') {
            if (n<10){
                if (Q=='G') System.out.println(6000);
                else System.out.println(10000);
            }
            else{
                if (Q=='G') System.out.println(9000);
                else System.out.println(12000);
            }
        }
    }
}
