package Unit6;

import java.util.Arrays;

/**
 * Last Name: Garg
 * First Name: Mihir
 * Student ID: 12104703
 * Period: 4
 *
 * Write the method average which accepts an int array and returns
 * the average of the values.
 * 
 * Write the method countAboveAve which accepts an int array and
 * returns the number of values that are above the average. You must
 * call average.
 * 
 * Write the method largest which accepts an int array and returns the
 * largest value of the array.
 * 
 * Write the method indexOfSmallest which accepts an int array and
 * returns the index of the smallest value. If there are multiple smallest
 * values, return the index of the first one.
 */
public class Average {
    /**
     * Returns the average of the values in a
     * 
     * @param a - array of integers
     * @return average
     */
    public static double average(int[] a) {
        // Your code goes here
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    /**
     * Counts the numbers above the average in a
     * 
     * @param a - array of integers
     * @return how many numbers in a are above average
     */
    public static int countAboveAve(int[] a) {
        // Your code goes here
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > average(a)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Finds the largest value in a
     * 
     * @param a - array of integers
     * @return largest value
     */
    public static int largest(int[] a) {
        // Your code goes here
        int largest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }

        }

        return largest;
    }

    /**
     * Returns the index of smallest element in a
     * 
     * @param a - array of integers
     * @return index of smallest element in a
     */
    public static int indexOfSmallest(int[] a) {
        // Your code goes here
        int minIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * Driver method
     * 
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, 4, 5, -2, 3, 4, 6, 4 };
        System.out.println(Arrays.toString(arr));
        System.out.println("Average = " + average(arr));
        System.out.println("There are " + countAboveAve(arr) + " numbers above the average!");
        System.out.println("Largerst value = " + largest(arr));
        System.out.println("Smallest value is at " + indexOfSmallest(arr));
    }
}