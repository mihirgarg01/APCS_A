package Unit4;

// import java.util.Scanner;

/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Write a program that uses nested for loops to print the following output
 * 
 * 1 
 * 1 2 
 * 1 2 3 
 * 1 2 3 4 
 * 1 2 3 4 5 
 * 1 2 3 4 
 * 1 2 3 
 * 1 2 
 * 1 
 * 
 *  
 */
public class Activity4_4_1 {
	
	/**
	 * Client method prints the desired output
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
        // Your code goes here
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }

	}

}