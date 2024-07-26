package JAVA._05_WhileLoop.EQ_34_to_39;
import java.util.Scanner;
public class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n= sc.nextInt();

//Direct:-
        System.out.println((int)(Math.log10(n)+1));

//Using While Loop:-
        int cod = 0;
        while(n>0){
            cod++;
            n/=10;
        }
        System.out.println(cod);
    }
}
