package _04_ForLoop.PractiseSession;
import java.util.Scanner;
public class Q2_Approach2 {
    public static void main(String[] args) {
        System.out.println("Enter 2 no.s: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //n1
        int b = sc.nextInt();  //n2

        while(a!=b){
            if(a>b) a=a-b;     //dry run line 11 and 12
            else b=b-a;
        }
        System.out.println("HCF is: " + a);
    }
}
