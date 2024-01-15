package Unit6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Garg - Mihir - 12104703 - 4
 * 
 * @see
 *      Write the methods of a Grades class that reads in names of students and
 *      their test scores from a file
 *      and counts the number of data points. It also finds the max and min
 *      scores and the students who got them.
 * 
 *      Do the following:
 *      1. Create three instance variables, one to store the scores, one to
 *      store the names of students,
 *      and one to hold the number of scores read. There can be a maximum of 100
 *      data points
 *      2. Write the constructor that takes in the name of the data file and
 *      populates two parallel arrays that hold
 *      the names of the students and their scores.
 *      3. Write a findMax() method that returns the location of the highest
 *      score in the array
 *      4. Write a findMin() method tat returns the location of the lowest score
 *      in the array
 *      5. Write a findMaxMin() method that calls the findMax and findMin
 *      methods and print the names and scores
 *      of students with the highest and lowest score. Here is a sample output.
 *      Ann got the highest score of 93.0
 *      Sam got the lowest score of 10.0
 */
public class Grades {
    // declare two parallel arrays and a variable to store the number of scores
    String[] names = new String[100];
    double[] scores = new double[100];
    int numScores = 0;

    /**
     * Constructor reads in the data and populates the arrays that hold the names
     * and scores and
     * stores the total number of scores read
     * 
     * @param fname - file name
     */
    public Grades(String fname) {
        // Your code goes here
        try {
            // Declare variables
            Scanner fileScanner = new Scanner(new File(fname));

            // Read the data from the file and populate the arrays
            while (fileScanner.hasNextLine()) {
                // Read the line
                Scanner lineScanner = new Scanner(fileScanner.nextLine());

                // Read the name
                names[numScores] = lineScanner.next();
                // Read the score
                scores[numScores] = lineScanner.nextDouble();
                // Update the total scores instance variable
                numScores++;

                lineScanner.close();
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Finds the index of the highest score
     * 
     * @return index of the highest score
     */
    public int findMax() {
        // Your code goes here
        int maxIndex = 0;

        for (int i = 1; i < numScores; i++) {
            if (scores[i] > scores[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    /**
     * Finds the index of the lowest score
     * 
     * @return index of the lowest score
     */
    public int findMin() {
        // Your code goes here
        int minIndex = 0;

        for (int i = 1; i < numScores; i++) {
            if (scores[i] < scores[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    /**
     * Prints the highest score and the name of the student who has the highest
     * score
     * Also prints the lowest score and the name of the student who has the lowest
     * score
     */
    public void printMaxMin() {
        // Your code goes here
        int maxIndex = findMax();
        int minIndex = findMin();

        System.out.println(names[maxIndex] + " got the highest score of " + scores[maxIndex]);
        System.out.println(names[minIndex] + " got the lowest score of " + scores[minIndex]);
    }
}