//38- Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
//Ex- 145 = 1! + 4! + 5! = 145
package _05_WhileLoop.EQ_34_to_39;
import java.util.Scanner;
public class EQ38_Strong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int n = sc.nextInt();  //145
        int dup = n;

        int sumOfFactorials=0;

        while(n>0){
            //Digit Separtion using While Loop
                int lastDigit = n%10;
            //Factorial of that digit using For Loop
                    int factorial=1;
                    for(int i=1 ; i<=lastDigit ; i++){
                        factorial = factorial * i;
                    }
            //Accumulating the Sum of factorials of digits
            sumOfFactorials = sumOfFactorials + factorial;
            n/=10;
        }
        System.out.println(sumOfFactorials==dup ? "Strong" : "Not Strong");
    }
}