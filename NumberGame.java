import java.util.Scanner;
import java.util.Random;
public class NumberGame 
{
    public static void main(String args[])
    {
        int min_no = 1, max_no = 100;
        int maxAttempts = 10;
        int score = 0;
        boolean playAgain = true;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (playAgain) 
        {
            int generatedNumber = random.nextInt(max_no - min_no + 1) + min_no;
            System.out.println("----------Number Game----------");
            System.out.println("Generate a number between " + min_no + " and " + max_no + "!");
            System.out.println("You have " + maxAttempts + " attempts to guess the number!");
            int attempt = 1;
            while (attempt <= maxAttempts) 
            {
                System.out.print( "Enter your guess: ");
                int userGuess = sc.nextInt();
                if (userGuess == generatedNumber) 
                {
                    System.out.println("Congratulations! You guessed the correct number!!!");
                    score++;
                    break;
                } 
                else if (userGuess < generatedNumber) 
                {
                    System.out.println("Too low! Try Again!");
                } 
                else 
                {
                    System.out.println("Too high! Try Again!");
                }
                attempt++;
            }
            System.out.println("Attempts taken: " + attempt);
            if (attempt > maxAttempts) 
            {
                System.out.println("You ran out of attempts, Better Luck next time! The correct number was: " + generatedNumber);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String x = sc.next();
            playAgain = x.equalsIgnoreCase("yes");
        }
        System.out.println("Your final score is: " +score);
    }
}