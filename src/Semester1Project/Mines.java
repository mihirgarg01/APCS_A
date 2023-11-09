package Semester1Project;

// Import Dependencies
import java.util.Random;
import java.util.Scanner;

/**
 * Simulate a game of Baccarat
 * Computer is dealer, player is user (console input)
 */
public class Mines {
    //Money Instance Variables
    private int betAmount = 0;
    private int playerBalance = 100;
    private int winningMultiplier = 1; //TODO: Make this linear, 1 gem found = 1% increase, 2 gems found = 2% increase, etc.

    // Game Control Instance Variables
    private int gemsCounter = 0;
    private int userGuesses = 0;
    private double mineProbability = 0;
    private String userGuess = ""; // 

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

    //TODO: Potentially add another constructor to customize the game? This might be too hard.

    /**
     * User sets how much to bet per round
     * 
     * @param betAmount
     * @returns void
     */
    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    /**
     * Uses random chance to check if the mine is a gem or mine
     * As more gems are found, probability isMine increases
     * 
     * @returns boolean
     */
    public boolean isMine() {
        // Pick a random number between 0 and 1 (inclusive)
        Random random = new Random();
        double rand = random.nextDouble();

        // Multiply randomNumber by the mine probability
        rand *= mineProbability;

        // Check if the random number is less than the mine probability
        if (rand >= 0.5) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Exports the UI for the user to see
     * Using: https://ozh.github.io/ascii-tables/
     * 
     * @return void
     */
    @Override
    public String toString() {
        String output = "+--+---+---+---+--+";



        return output;
    }

     
}
