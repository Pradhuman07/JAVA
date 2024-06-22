//18.Accept 3 numbers and print the greatest b/w them
package _03_IfElse.EQ_12To22;
import java.util.Scanner;
public class EQ18_M2_Best_GreatestBWnNo {
    public static void main(String[] args) {

//Greatest element of Array mein yhi kaam aayega..
// for loop lga denge bss + yha hm aasani se 3,4,5,6 numbers
// tk maximum nikal skte h bina kisi confusion ke

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers:-");

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();

        int greatest = a;

        if(b>greatest) greatest=b;
        if(c>greatest) greatest=c;
        if(d>greatest) greatest=d;
        if(e>greatest) greatest=e;

        System.out.println("The greatest number is: " + greatest);
    }
}