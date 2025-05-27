import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1;  
        int guess = 0;
        System.out.println("Guess the number between 1 and 100:");
        while (guess != target) {
            guess = sc.nextInt();
            if (guess < target) System.out.println("Too low! Try again:");
            else if (guess > target) System.out.println("Too high! Try again:");
            else System.out.println("Congratulations! You guessed it.");
        }
    }
}
