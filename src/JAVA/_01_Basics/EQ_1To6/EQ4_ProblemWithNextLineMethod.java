//16- Accept age and name from the user. Check if the user is a valid voter or not.
//Valid - Hello Shery, You are a valid voter.
//Invalid - Sorry Shery, you can't cast the vote.
//Part 2 - Print after how many years the user will be eligible

package JAVA._01_Basics.EQ_1To6;
import java.util.Scanner;
public class EQ4_ProblemWithNextLineMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();                   //18 + 'enter'... enter gya nextLine() mein;

        sc.nextLine();    //Solution of the Problem....Dummy nextLine()..ye enter ko khaa lega

        System.out.println("Enter your name");
        String name = sc.nextLine();

        if(age>18) System.out.println("Hello " + name + " You are a Valid Voter");
        else System.out.println("Sorry " + name + " You are not a Valid Voter But you can cast the vote after " + (18-age) + " years." );

    }
}
//If we try to read String after reading in an Integer, Double or Float etc.
//Java does not give us a chance to input anything for the name variable.
//When the method input.nextLine() is called Scanner object will wait for
//us, to hit enter and the enter key is a character(“\n”).

// 1.We first prompt the user to enter an integer age using nextInt().
// 2.After reading the integer,we immediately hit enter and enter is
//also a character represented by “\n”–69\n
// 3.The int value 69 is assigned in age but not the \n still left in the
//memory or buffer.
// 4.In nextline when we Call nextLine()to consume the name it first
//check in buffer is there anything as wehave \n in buffer it take \n
// (for nextLine() method \n is the stopping point it will consider we
//stop giving input and return) and skip the line.

//Solution:-

//1.After taking an integer input we Call nextLine() to consume the name
// character left in the input buffer.
// In next line when we Call a Dummy nextLine() to consume the name character left in the input buffer.
// 2.Then,we prompt the user to enter a string using nextLine().