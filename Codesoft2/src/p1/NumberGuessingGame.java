package p1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;
        System.out.println("******WELCOME TO THE NUMBER GUESSING GAME!!!******");
        do 
        {
            int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            System.out.println("\n------Round " + (rounds + 1)+"------");
            System.out.println("\nGuess the number between " + lowerBound + " and " + upperBound);
            while (attempts < maxAttempts) 
            {
                System.out.print("\nEnter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;
                if (userGuess == secretNumber)
                {
                    System.out.println("\nCongratulations! You guessed the correct number in " + attempts + " attempts.");
                    totalAttempts += attempts;
                    break;
                } 
                else if (userGuess < secretNumber) 
                {
                    System.out.println("Too low. Try again.");
                }
                else 
                {
                    System.out.println("Too high. Try again.");
                }
            }
            if (attempts >= maxAttempts)
            {
                System.out.println("\nSorry, you've reached the maximum number of attempts.");
                System.out.println("\nThe correct number was: " + secretNumber);
            }
            rounds++;
            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")) 
            {
                break;
            }
        } 
        while (true);
        System.out.println("\nThanks for playing!!!!!!");
        System.out.println("\nYour total score is based on the total attempts: " + totalAttempts);
    }
}
