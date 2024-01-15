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
        System.out.println("The goal is to find all 5 gems without hitting a mine");
        System.out.println("You win when you find all 5 gems");
        System.out.println("Good luck!\n");

        while (isPlaying) {

            // Prompt the user for the x cordinate to bet
            System.out.println("Enter the x coordinate to bet on (1-5): ");

            // Get the user's input
            int x = scan.nextInt();

            // Prompt the user for the y cordinate to bet
            System.out.println("Enter the y coordinate to bet on (1-5): ");
            int y = scan.nextInt();

            // Check if the selection is valid or if the location is already guessed
            if (!mines.isValidSelection(x, y) || mines.isAlreadyGuessed(x, y)) {
                System.out.println("Invalid cordinate! (You may have already guessed that location))");
                continue;
            }

            // Check if it's a mine
            if (mines.isMine(x, y)) {
                System.out.println("You hit a mine! You Loose!");
                isPlaying = false;
            }
            // Not a mine, check if gem
            else if (mines.isGem(x, y)) {
                System.out.println("You found a gem!");
                System.out.println(mines.toString());

                if (mines.isWin()) {
                    System.out.println("You win! Congradulations!");
                    isPlaying = false;
                }
            }
            // Not a mine, not a gem
            else {
                System.out.println("You found nothing!");
                System.out.println(mines.toString());

            }

        }

        // Close the scanner to avoid memory leaks
        scan.close();
    }
}
