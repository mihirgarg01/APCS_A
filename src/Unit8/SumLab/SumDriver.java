package Unit8.SumLab;

import java.util.Random;

public class SumDriver {
    public static void main(String[] args) {
        Random rand = new Random(123);

        int[][] matrix = new int[3][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Fill the matrix with random numbers from [0,10)
                matrix[i][j] = rand.nextInt(10);
            }
        }

        Sum s = new Sum();
        System.out.println(s.toString(matrix));
    }
}
