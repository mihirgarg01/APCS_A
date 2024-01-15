package Semester1Project;

// Import Dependencies
import java.util.Random;

/**
 * Simulate a game of Baccarat
 * Computer is dealer, player is user (console input)
 */
public class Mines {

    // Game Control Instance Variables
    private int gemsCounter = 0;
    private double mineProbability;
    private double gemProbability;
    /**
     * Makeshift string array
     * "," seperates each value
     * 
     * @example "10,2,6"
     */
    private String row1Guesses = "";
    private String row2Guesses = "";
    private String row3Guesses = "";
    private String row4Guesses = "";
    private String row5Guesses = "";

    /**
     * toString row variables
     * 5, 9, 13, 17, 21 are the vertical lines where G or M will apear
     * ----------------------111111111122222
     * ------------0123456789012345678901234
     * 
     */
    String rtop = "   +---+---+---+---+---+\n";
    String row5 = "5  |   |   |   |   |   |\n";
    String ro45 = "   +---+---+---+---+---+\n";
    String row4 = "4  |   |   |   |   |   |\n";
    String ro34 = "   +---+---+---+---+---+\n";
    String row3 = "3  |   |   |   |   |   |\n";
    String ro23 = "   +---+---+---+---+---+\n";
    String row2 = "2  |   |   |   |   |   |\n";
    String ro12 = "   +---+---+---+---+---+\n";
    String row1 = "1  |   |   |   |   |   |\n";
    String rbot = "   +---+---+---+---+---+\n";
    String rnum = "     1   2   3   4   5  \n";

    // Declare constants
    private final int MINES_AMOUNT = 6; // 10 gems
    private final int GEMS_AMOUNT = 10; // 5 gems
    private final int TOTAL_SQUARES = 25; // 5x5 grid
    private final String GEM = "G";

    /**
     * Default Constructor
     */
    public Mines() {
        // Initialize instance variables
        // this.betAmount = 0;
        this.gemsCounter = 0;
        mineProbability = (double) MINES_AMOUNT / TOTAL_SQUARES;
        gemProbability = (double) GEMS_AMOUNT / TOTAL_SQUARES;
    }

    /**
     * Convert an integer into a character
     * Created to avoid repetition in isAlreadyGyesed()
     * 
     * @param digit
     * @return char - the ASCI character representation of the digit
     */
    private char intToChar(int digit) {
        return (char) ('0' + digit);
    }

    /**
     * Check if the selection of the cordinate is valid
     * Both x and y must be between 1 and 5 (inclusive)
     * 
     * @param x
     * @param y
     * @return boolean - true if valid range, false otherwise
     */
    public boolean isValidSelection(int x, int y) {
        if (x >= 1 && x <= 5 && y >= 1 && y <= 5) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check if the user already guessed the current guess
     *
     * @param currentGuess the current guess
     * @param guesses      the current guesses for that specific row (e.g.
     *                     row1Guesses)
     * @pre currentGuess non-negative integer that's one or two digits in length
     * @return true if the guess has already been made, false otherwise
     */
    public boolean isAlreadyGuessed(int x, int y) {

        // public boolean isAlreadyGuessed(int currentGuess, String guesses) {
        String guesses = "";
        if (y == 1) {
            guesses = row1Guesses;
        } else if (y == 2) {
            guesses = row2Guesses;
        } else if (y == 3) {
            guesses = row3Guesses;
        } else if (y == 4) {
            guesses = row4Guesses;
        } else if (y == 5) {
            guesses = row5Guesses;
        }

        // Is the guess two digits?
        if (x >= 10) {
            // Get the first digit of the guess and convert it to a char
            char firstDigit = intToChar(x / 10);
            // Get the second digit of the guess and convert it to a char
            char secondDigit = intToChar(x % 10);

            // System.out.println("First digit: " + firstDigit + " Second digit: " +
            // secondDigit);

            /**
             * loop over guesses and see if both digits are present
             * the loop will stop at the second to last digit (i < guesses.length() - 1)
             */
            for (int i = 0; i < guesses.length() - 1; i++) {
                // System.out.println("Checking: " + guesses.charAt(i) + " and " +
                // guesses.charAt(i + 1));

                // Check if the first digit and second digit match
                if (guesses.charAt(i) == firstDigit && guesses.charAt(i + 1) == secondDigit) {
                    return true;
                }
            }
        }
        // The guess is only one digit
        else {
            // loop over guesses and see if the digit is present
            for (int i = 0; i < guesses.length(); i++) {
                // System.out.println("Checking: " + guesses.charAt(i));

                // Check if the digit matches
                if (guesses.charAt(i) == intToChar(x)) {
                    return true;
                }
            }
        }

        // If the match is not found, return false
        return false;
    }

    /**
     * Uses random chance to check if the mine is a gem or mine
     * As more gems are found, probability isMine increases
     * 
     * (0,0) is at the bottom left tile
     * 
     * @param x
     * @param y
     * @pre x and y are non-negative integers and are less than or equal to 5
     * @return true if mine, false if gem
     */
    public boolean isMine(int x, int y) {
        // Pick a random number between 0 and 1 (inclusive)
        Random random = new Random();
        double rand = random.nextDouble();

        // System.out.println(rand);

        // Check if the random number is less than the mine probability
        if (rand <= mineProbability) {
            return true;
        } else {
            return false;
        }
    }

    
    /** 
     * @param x
     * @param y
     * @return boolean
     */
    public boolean isGem(int x, int y) {

        // Pick a random number between 0 and 1 (inclusive)
        Random random = new Random();
        double rand = random.nextDouble();

        // System.out.println(rand);

        // Check if the random number is less than the mine probability
        if (rand <= gemProbability) {

            updateGuesses(x, y, GEM);

            gemsCounter++;
            return true;
        } else {

            updateGuesses(x, y, "N");
            return false;
        }
    }

    public boolean isWin() {
        System.out.println("Gems: " + gemsCounter);
        if (gemsCounter == 5) {
            return true;
        } else {
            return false;   
        }
    }

    /**
     * Update the row()Guesses string
     * 
     * @param x    x-cordinate
     * @param y    y-cordinate
     * @param type type of guess (mine or gem)
     * @pre x and y are non-negative integers and are less than or equal to 5
     * @return void - updates instance variables
     */
    public void updateGuesses(int x, int y, String type) {
        // Offset by 1 (was originally 5), grid pattern repeats by 4
        int stringX = (x * 4) + 1;

        // Based on the y-cordinate, update the according row(y)Guesses
        if (y == 1) {
            row1Guesses += x + ",";
            row1 = row1.substring(0, stringX) + type + row1.substring(stringX + 1);
        } else if (y == 2) {
            row2Guesses += x + ",";
            row2 = row2.substring(0, stringX) + type + row2.substring(stringX + 1);
        } else if (y == 3) {
            row3Guesses += x + ",";
            row3 = row3.substring(0, stringX) + type + row3.substring(stringX + 1);
        } else if (y == 4) {
            row4Guesses += x + ",";
            row4 = row4.substring(0, stringX) + type + row4.substring(stringX + 1);
        } else if (y == 5) {
            row5Guesses += x + ",";
            row5 = row5.substring(0, stringX) + type + row5.substring(stringX + 1);
        }
    }

    /**
     * Exports the UI for the user to see
     * Using: https://ozh.github.io/ascii-tables/
     * 
     * @return String that the program prints
     */
    @Override
    public String toString() {

        // row5 = row5.substring(0, 2) + "💎" + row5.substring(3);
        // row5 = row5.substring(0, 6) + "💎" + row5.substring(7);

        return rtop + row5 + ro45 + row4 + ro34 + row3 + ro23 + row2 + ro12 + row1 + rbot + rnum;
    }

}