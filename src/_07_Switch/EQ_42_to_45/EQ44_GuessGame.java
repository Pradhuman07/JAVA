package _07_Switch.EQ_42_to_45;
import java.util.Scanner;
public class EQ44_GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = (int) (Math.random()*100) + 1;
        int maxGuess = 10;

        System.out.println("Guess the Number (1-100)");

        do{
            maxGuess--;
            if(maxGuess==0){
                System.out.println("Game Over");
                break;
            }
            int guess = sc.nextInt();

            if(guess == number){
                System.out.println("You Won");
                break;
            }
            if (guess > number) {
                System.out.println("Too small,Try Again");
            }
            else{
                System.out.println("Too large,Try Again");
            }
        } while (true);
    }
}
