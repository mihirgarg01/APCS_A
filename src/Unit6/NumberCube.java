package Unit6;

import java.util.Random;

/**
 * 
 * @author Garg - Mihir - 12104703 - 4
 * 
 *         A statistician is studying sequences of numbers obtained by
 *         repeatedly tossing a
 *         six-sided number cube. On each side of the number cube is a single
 *         number in the
 *         range of 1 to 6, inclusive, and no number is repeated on the cube.
 *         The statistician
 *         is particularly interested in runs of numbers. A run occurs when two
 *         or more
 *         consecutive tosses of the cube produce the same value. For example,
 *         in the following
 *         sequence of cube tosses, there are runs starting at positions 1, 6,
 *         12, and 14.
 * 
 *         [1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5]
 * 
 *         1. Write the method toss that takes in a Random object as a parameter
 *         and returns
 *         a random number between 1 and 6 inclusive.
 *         2. Write the method getCubeTosses that takes a Random object and a
 *         number of tosses
 *         as parameters. The method should return an array of the values
 *         produced by tossing
 *         the number cube the given number of times.
 *         3. Write the method getLongestRun that takes as its parameter an
 *         array of integer
 *         values representing a series of number cube tosses. The method
 *         returns the
 *         starting index in the array of a run of maximum size. A run is
 *         defined as
 *         the repeated occurrence of the same value in two or more consecutive
 *         positions
 *         in the array. In the example array shown above there are two runs of
 *         length 4.
 *         One starts at index 6 and one at index 14. The method may return
 *         either of
 *         those indices.
 * 
 *         If there are no runs of any value, the method returns -1.
 * 
 */
public class NumberCube {
    /**
     * Tosses a number cube and returns a number between 1 and 6 inclusive
     * 
     * @param rand - Random object
     * @return an integer value between 1 and 6, inclusive
     */
    public int toss(Random rand) {
        // Your code goes here
        return rand.nextInt(6) + 1;
    }

    /**
     * Returns an array of values produced by tossing the number cube the given
     * number of times
     * 
     * @param rand      - Random object
     * @param numTosses - number of tosses
     * @return - array of values produced by tossing the number cube
     */
    public int[] getCubeTosses(Random rand, int numTosses) {
        // Your code goes here
        int[] tosses = new int[numTosses];
        for (int i = 0; i < numTosses; i++) {
            tosses[i] = toss(rand);
        }

        return tosses;
    }

    /**
     * Returns the starting index of a longest run of two or more consecutive
     * repeated
     * values in the array values
     * 
     * @param tosses - an array of integer values represeing a series of number cube
     *               tosses.
     *               Pre-condition: values.length > 0
     * @return the starting index of a run of maximum size
     *         -1 if there is no run
     */
    public int getLongestRun(int[] tosses) {
        // Your code goes here
        if (tosses.length == 0)
            return -1;

        int longestRunIndex = -1;
        int longestRunLength = 0;
        int currentRunIndex = 0;
        int currentRunLength = 1;

        for (int i = 1; i < tosses.length; i++) {
            if (tosses[i] == tosses[i - 1]) {
                currentRunLength++;
                if (currentRunLength > longestRunLength) {
                    longestRunLength = currentRunLength;
                    longestRunIndex = currentRunIndex;
                }
            } else {
                currentRunIndex = i;
                currentRunLength = 1;
            }
        }

        return longestRunIndex;
    }
}