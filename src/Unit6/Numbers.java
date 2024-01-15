package Unit6;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Garg - Mihir - 12104703 - 4
 * 
 * @see
 *      Write the methods of a Numbers class that reads in data from a file and
 *      counts the
 *      number of positives, negatives, zeros, odds and evens. You can read
 *      about File I/O
 *      here
 *      (https://drive.google.com/file/d/1kxgxY13LrfOD5NyH4crSkU6BRdR5E9Uq/view)
 * 
 *      Do the following:
 *      1. Create an instance variable that stores an array of integers. The
 *      maximum number of
 *      data points is 1000.
 *      2. Create an instance variable that stores the number of data actually
 *      in the array
 *      3. Write a countNumbers() method that counts the number of positive
 *      numbers, negative numbers,
 *      zeros, odd numbers and even numbers and then prints the counts. It also
 *      prints the
 *      total number of entries in the array. This method will call a print
 *      method that is written next.
 *      4. Write a print(int pos, int neg, int zero, int odd, int even) method
 *      that counts and prints the
 *      total number, the number of positives, negatives, zeros, odds and evens.
 *      Here is what a sample
 *      run would look like.
 *      Total: 500
 *      Positives: 495
 *      Negatives: 3
 *      Zeroes: 2
 *      Odds: 237
 *      Evens: 263
 *      5. Create a constructor that takes in the name of the data file and
 *      reads the data
 *      provided in the file and populates the array. It also calculates the
 *      number of data
 *      points actually read and updates the corresponding instance variable. It
 *      then calls the
 *      countNumbers method written above to count and print the number of
 *      positives, negatives,
 *      zeros, odds and evens.
 *
 */

public class Numbers {
    // instance variables go here
    // Max number of datapoints is 1000
    int[] integers = new int[1000];

    /**
     * Counts and prints out the number of positives, negatives, zeros, odds and
     * evens
     */
    public void countNumbers() {
        // Your code goes here
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int odd = 0;
        int even = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > 0) {
                pos++;
            } else if (integers[i] < 0) {
                neg++;
            } else {
                zero++;
            }

            if (integers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        print(pos, neg, zero, odd, even);
    }

    /**
     * Prints out the number of positives, negatives, zeros, odds and evens
     * 
     * @param pos  - number of positives in the data set
     * @param neg  - number of negatives in the data set
     * @param zero - number of zeros in the data set
     * @param odd  - number of odds in the data set
     * @param even - number of evens in the data set
     */
    public void print(int pos, int neg, int zero, int odd, int even) {
        // Your code goes here
        System.out.println("Total: " + integers.length + "\nPositives: " + pos + "\nNegatives: " + neg + "\nZeroes: "
                + zero + "\nOdds: " + odd + "\nEvens: " + even);
    }

    /**
     * Constructor populates integers with elements in the given file name and
     * counts the number of positives, negatives, zeros, odds and evens
     * 
     * @param fname - file name
     */
    public Numbers(String fname) {
        // Your code goes here
        try {
            File file = new File(fname);
            Scanner scan = new Scanner(file);
            
            // Temporary array since integers needs to be updated in case the number of values is less than 1000
            int[] temp = new int[10000];
            int count = 0;

            while (scan.hasNextInt() && count < temp.length) {
                temp[count] = scan.nextInt();
                count++;
            }

            scan.close();

            // Copy the relevant elements to integers
            integers = Arrays.copyOf(temp, count);
        } catch (Exception e) {
            System.out.println("File not found");
        } finally {
            countNumbers();
        }

    }

}