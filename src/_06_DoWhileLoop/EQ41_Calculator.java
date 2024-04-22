package _06_DoWhileLoop;
import java.util.Scanner;
public class EQ41_Calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to Sasta Calculator");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers and ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ch;

        do{
            System.out.println("Press \n 1 for Addition \n 2 for Subtraction \n 3 for Multiplication \n 4 for Division \n 5 to Exit");
            ch=sc.nextInt();

            if(ch==1) System.out.println("Addition is: " + (a+b));
            else if(ch==2) System.out.println("Subtraction is: " + (a-b));
            else if(ch==3) System.out.println("Multiplication is: " + (a*b));
            else if(ch==4) System.out.println("Division is: "+(a/b));
            else if(ch==5) break;
            else System.out.println("Wrong Input");
        }while(true);
        System.out.println("Out of the Loop");
    }
}