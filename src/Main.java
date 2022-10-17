import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random rnd = new Random();
        int die1;
        int die2;
        int sum;
        int point;
        String input = "";
        boolean shouldContinue = true;
        boolean loop = true;

        while (shouldContinue == true)
        {
            // initial rolls
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;

            sum = die1 + die2;

            // check if its a natural or a crap
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You rolled a " + sum + ". You crapped out.");
                loop = false;
            }
            if (sum == 7 || sum == 11)
            {
                System.out.println("You rolled a " + sum + ". That's a natural, you win.");
                loop = false;
            }

            // inner loop for rolling the point
            if (sum == 4 || sum == 5 || sum ==6 || sum == 8 || sum == 9 || sum == 10)
            {
                // tell them the roll
                System.out.println("You rolled a " + die1 + " and a " + die2);
                point = sum;

                // tell them the point
                System.out.println("The point is " + point);

                // loop of rolling until point is made or craps out
                while (loop == true)
                {
                    // rolling for the point
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;
                    System.out.println("Your next roll is a " + die1 + " and a " + die2);

                    // check if they made the point
                    if (sum == point)
                    {
                        System.out.println("That's " + sum + ". You made the point!");
                        loop = false;
                        // exit the rolling loop
                    }

                    // check if they crapped out
                    if (sum == 7)
                    {
                        System.out.println("You made a 7 and lost.");
                        loop = false;
                        // exit the rolling loop
                    }
                } // end of the while loop
            }  // end of the point loop

            // check for play again
            System.out.println("Would you like to play again? [Y][N]");
            input = kb.nextLine();
            if (input.equalsIgnoreCase("Y"))
            {
                loop = true;
            }
            else
            {
                shouldContinue = false;
                System.out.println("Thanks for playing.");
            }

        } // end of the game loop
    } // end of the main
} // end of the main class