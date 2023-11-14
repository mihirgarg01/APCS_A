package Semester1Project;

public class TestingMinesDriver {

    // Instance Variables
    /**
     * Makeshift string array
     * "," seperates each value
     * 
     * @example "10,2,6"
     */
    private String guesses = "";

    /**
     * Convert an integer into a character
     * Created to avoid repetition in isAlreadyGyesed()
     * 
     * @param digit
     * @return
     */
    private char intToChar(int digit) {
        return (char) ('0' + digit);
    }

    /**
     * Check if the user already guessed the current guess
     *
     * @param currentGuess the current guess
     * @pre currentGuess non-negative integer that's one or two digits in length
     * @return true if the guess has already been made, false otherwise
     */
    public boolean isAlreadyGuessed(int currentGuess) {

        // Is the guess two digits?
        if (currentGuess >= 10) {
            // Get the first digit of the guess and convert it to a char
            char firstDigit = intToChar(currentGuess / 10);
            // Get the second digit of the guess and convert it to a char
            char secondDigit = intToChar(currentGuess % 10);

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
                if (guesses.charAt(i) == intToChar(currentGuess)) {
                    return true;
                }
            }
        }

        // If the match is not found, return false
        return false;
    }

    public void testing() {
        // User guesses 10
        guesses += "10,";
        isAlreadyGuessed(10);

        guesses += "2,";
        isAlreadyGuessed(2);

        guesses += "6,";
        isAlreadyGuessed(10);
    }

    public static void main(String[] args) {
        // String row5 = "| | | | | |\n";

        // row5 = row5.substring(0, 2) + "💎" + row5.substring(2, row5.length() - 1);

        // row5 = row5.substring(0, 6) + "💎" + row5.substring(6, row5.length() - 1);

        // row5 = row5.substring(0, 18) + "💎" + row5.substring(18);

        // System.out.println(row5);

        // String newRow = "| | | | | |\n";
        // String row0guess = "10,2";

        // String newRow = "| | | | | |\n";
        // String row0guess = "10,2";

        // int counter = 0;

        // for (int i = 0; i < newRow.length(); i++) {
        // if (i == 2 || i == 6 || i == 10 || i == 14 || i == 18) {
        // newRow = newRow.substring(0, i + counter) + "💎" + newRow.substring(i + 1 +
        // counter);
        // counter++;
        // }
        // }

        // System.out.println(newRow);

        // String aRow = "| | | | | |\n";

        // int firstGuess = 10;
        // int secondGuess = 2;
        // int thirdGuess = 6;

        // aRow = aRow.substring(0, firstGuess) + "G" + aRow.substring(firstGuess + 1);

        // System.out.println(aRow);

        // aRow = aRow.substring(0, secondGuess) + "G" + aRow.substring(secondGuess +
        // 1);

        // System.out.println(aRow);

        // aRow = aRow.substring(0, thirdGuess) + "G" + aRow.substring(thirdGuess + 1);

        // System.out.println(aRow);

        TestingMinesDriver driver = new TestingMinesDriver();
        driver.testing();

    }
}