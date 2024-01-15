package Unit6;

import java.util.Arrays;
import java.util.Random;

public class NumberCubeDriver {
    public static void main(String[] args) {
        NumberCube cube = new NumberCube();
        int numTosses = 9;
        Random rand = new Random(3747);
        System.out.println("Testing getCubeTosses");
        int[] tosses = cube.getCubeTosses(rand, numTosses);

        if (tosses.length < numTosses) {
            System.out.println("It looks like you are not returning an array of the correct size:");
            System.out.println(Arrays.toString(tosses));
        } else {
            System.out.println("You returned an array of the correct size:");
            System.out.println(Arrays.toString(tosses));
        }

        System.out.println("\nTesting getLongestRun");

        int[] values = { 3, 5, 6, 6, 3, 6, 4, 4, 4, 2, 6, 4, 1, 1, 1, 1 };
        int longestRunIdx = cube.getLongestRun(values);
        System.out.println(Arrays.toString(values));
        System.out.println("Longest run index = " + longestRunIdx);
        if (longestRunIdx != 12) {
            System.out.println("Your code does not return the correct index.");

            if (longestRunIdx == 2 || longestRunIdx == 6)
                System.out.println("It is returning the start index of a run, but that run is not the longest.");

            System.out.println("Remember that your code must return the start index of the longest run of tosses.");
        } else {
            System.out.println("Looks like your code works well!");
        }
    }
}