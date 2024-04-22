package _06_DoWhileLoop;
import java.util.Scanner;
public class EQ40_Syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch; //global scope necessary to be accessed by while

        do{
            System.out.println("Hello");
            System.out.println("Press 1 to repeat");
            ch = sc.nextInt();
        } while (ch==1);
    }
}
//--Executes at least one time
//--Don't forget to put semicolon after while
//--Executes until conditions returns false