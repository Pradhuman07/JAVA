package _07_Switch;
import java.util.Scanner;
public class EQ44_GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxTry = 3;

        int key = (int)(Math.random()*100) + 1;

        do {
            if(maxTry==0){
                System.out.println("Sorry,No trials left." +
                        "You Lost!");
                break;
            }

            System.out.println("Guess the Number (1-100)");
            int guess = sc.nextInt();

            if (guess == key) {
                System.out.println("You Won");
                break;
            }

            else if (guess<key) {
                System.out.println("Too small,Try Again");
            }
            else {
                System.out.println("Too large,Try Again");
            }
            maxTry--;
        } while (true);
    }
}