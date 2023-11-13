package Semester1Project;

public class MinesDriver {
    static String guesses = "";
    
    public static boolean isAlreadyGuessed(int guess) {
        boolean result = false;

        // Is the guess two digits?
        if (guess >= 10) {
            // Get the first digit of the guess
            int firstDigit = guess / 10;
            // Get the second digit of the guess
            int secondDigit = guess % 10;

            // loop over guesses and see if both digits are present
            

        } else {
            // Guess is only one digit
        
        }

        return result;
    }

    public static void main(String[] args) {
        // String row5 = "| | | | | |\n";

        // row5 = row5.substring(0, 2) + "💎" + row5.substring(2, row5.length() - 1);

        // row5 = row5.substring(0, 6) + "💎" + row5.substring(6, row5.length() - 1);

        // row5 = row5.substring(0, 18) + "💎" + row5.substring(18);

        // System.out.println(row5);

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

        /**
         * This is a string array of all the user guesses
         * An actuall array [] cannot be used because our CSA class has not learned it
         * yet
         * Each value will be seperated by a comma and a for loop can be used to access
         * each value
         * 
         * @example "10,2,6"
         */

        // User guesses 10
        guesses += "10,";
        activeGuess = 10;

        System.out.println(isAlreadyGuessed(10));

        // int secondGuess = 2;
        // int thirdGuess = 6;

        // aRow = aRow.substring(0, firstGuess) + "G" + aRow.substring(firstGuess + 1);

        // System.out.println(aRow);

        // aRow = aRow.substring(0, secondGuess) + "G" + aRow.substring(secondGuess +
        // 1);

        // System.out.println(aRow);

        // aRow = aRow.substring(0, thirdGuess) + "G" + aRow.substring(thirdGuess + 1);

        // System.out.println(aRow);

    }
}