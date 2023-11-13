package Semester1Project;

// Import Dependencies
import java.util.Random;
import java.util.Scanner;

/**
 * Simulate a game of Baccarat
 * Computer is dealer, player is user (console input)
 */
public class Mines {
    // Money Instance Variables
    private int betAmount = 0;
    private int playerBalance = 100;
    private int winningMultiplier = 1; // TODO: Make this linear, 1 gem found = 1% increase, 2 gems found = 2%
                                       // increase, etc.

    // Game Control Instance Variables
    private int gemsCounter = 0;
    private int userGuesses = 0;
    private double mineProbability = 0;
    /**
     * Use like an array but in a string
     * "," seperates each coordinate
     * " | " seperates cordinates where the user already guessed
     * Ex: "3,4 | 0,1"
     */
    private String userGuess = "";

    // Declare constants
    private final int MINES_AMOUNT = 6; // 19 gems
    private final int TOTAL_SQUARES = 25; // 5x5 grid

    /**
     * Default Constructor
     */
    public Mines() {
        // Initialize instance variables
        this.betAmount = 0;
        this.playerBalance = 100;
        this.winningMultiplier = 1;

        this.gemsCounter = 0;
        this.userGuesses = 0;
        mineProbability = (double) (MINES_AMOUNT / TOTAL_SQUARES);
    }

    // TODO: Potentially add another constructor to customize the game? This might
    // be too hard.

    /**
     * User sets how much to bet per round
     * 
     * @param betAmount
     * @return void
     */
    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    /**
     * Check if the user already guessed this coordinate
     * 
     * (0,0) is at the bottom left tile
     * 
     * @param x
     * @param y
     * @return true if user already guessed this coordinate, false if not
     */
    public boolean isGuessed(int x, int y) {
        // Check if user already guessed this coordinate
        //TODO: Change to not use .contains
        if (userGuess.contains(x + "," + y)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Uses random chance to check if the mine is a gem or mine
     * As more gems are found, probability isMine increases
     * 
     * (0,0) is at the bottom left tile
     * 
     * @param x
     * @param y
     * @return true if mine, false if gem
     */
    public boolean isMine(int x, int y) {
        // Pick a random number between 0 and 1 (inclusive)
        Random random = new Random();
        double rand = random.nextDouble();

        // Multiply randomNumber by the mine probability
        rand *= mineProbability;

        // Check if the random number is less than the mine probability
        if (rand >= 0.5) {
            return true;
        } else {
            // Update userGuess with the cordinate
            userGuess += x + "," + y + " | ";
            return false;
        }
    }

    /**
     * Exports the UI for the user to see
     * Using: https://ozh.github.io/ascii-tables/
     * Each row is exactly 23 characters long (21 for table, 2 for \n)
     * 2, 6, 10, 14, 18 are the vertical lines
     * 
     * @return void
     */
    @Override
    public String toString() {
        //                       1111111111222
        //             01234567890123456789012
        String rtop = "+---+---+---+---+---+\n"; 
        String row5 = "|   |   |   |   |   |\n";
        String ro45 = "+---+---+---+---+---+\n";        
        String row4 = "|   |   |   |   |   |\n";
        String ro34 = "+---+---+---+---+---+\n";
        String row3 = "|   |   |   |   |   |\n";
        String ro23 = "+---+---+---+---+---+\n";
        String row2 = "|   |   |   |   |   |\n";
        String ro12 = "+---+---+---+---+---+\n";
        String row1 = "|   |   |   |   |   |\n";
        String rbot = "+---+---+---+---+---+\n";

        row5 = row5.substring(0, 2) + "💎" + row5.substring(3);
        row5 = row5.substring(0, 6) + "💎" + row5.substring(7);
        

        return rtop + row5 + ro45 + row4 + ro34 + row3 + ro23 + row2 + ro12 + row1 + rbot;
    }

}
