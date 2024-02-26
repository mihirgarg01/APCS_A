package Unit8.SumLab;

import java.util.Arrays;

public class Sum {
    // Find sum of all elements in each roy
    public int[] rowSum(int[][] arr) {

        // Create an array to store the sum of each row
        int[] sum = new int[arr.length];

        // Nested loop is REQUIRED to access every row THEN every collum
        for (int i = 0; i < arr.length; i++) {
            // Access the collum of the current row
            for (int j = 0; j < arr[i].length; j++) {
                sum[i] += arr[i][j];
            }
        }

        return sum;

    }

    /**
     * Finds the sum of each collum in a 2D array
     * 
     * @pre-condition every row has the same number/size of collums (cannot use jagged array)
     * @param arr
     * @return
     */
    public int[] colSum(int[][] arr) {

        int[] sum = new int[arr[0].length];

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                sum[j] += arr[i][j];
            }
        }

        return sum;

    }
    
    public String toString(int[][] arr) {
        String s = "";

        // Print the 2D array
        for (int[] row : arr) {

            for (int n : row) {
                s += n + "\t";
            }
            s += "\n";
        }

        // Print the sum of each row
        s += "Row sums: ";
        s += Arrays.toString(rowSum(arr)) + "\n";
        
        // Print the sum of each collum
        s += "Collum sums: ";
        s += Arrays.toString(colSum(arr)) + "\n";

        return s;
    }
}
