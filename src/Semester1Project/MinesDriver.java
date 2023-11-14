package Semester1Project;

import java.util.Scanner;

public class MinesDriver {
    public static void main(String[] args) {
        // Declare variables
        Mines mines = new Mines();
        Scanner scan = new Scanner(System.in);
        boolean isPlaying = true;

        // Welcome message
        System.out.println("Welcome to Gems!");
        System.out.println("You have $" + mines.getPlayerBalance());
        System.out.println("As you get more gems (G), your winning multiplier will increase!");
        System.out.println("But be careful, the more gems you find, the more mines (M) there will be!");
        System.out.println("Good luck!\n");

        while (isPlaying) {

            // Prompt the user for the x cordinate to bet
            System.out.println("Enter the x coordinate to bet on (1-5): ");

            // Get the user's input
            int x = scan.nextInt();

            // Prompt the user for the y cordinate to bet
            System.out.println("Enter the y coordinate to bet on (1-5): ");
            int y = scan.nextInt();

            // Check if the selection is valid
            if (!mines.isValidSelection(x, y)) {
                System.out.println("Invalid cordinate! Must be between 1 and 5");
                continue;
            }

            // Check if the location is already guessed
            if (mines.isAlreadyGuessed(x, y)) {
                System.out.println("You already guessed that location!");
                continue;
            }
            // Not guessed yet, check if new guess is a mine
            else {
                // Check if it's a mine
                if (mines.isMine(x, y)) {
                    System.out.println("You hit a mine! You Loose!");
                } else {
                    System.out.println(mines.toString());
                }
            }

        }

        // Close the scanner to avoid memory leaks
        scan.close();
    }
}
