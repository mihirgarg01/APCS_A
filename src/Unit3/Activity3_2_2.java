package Unit3;
import java.util.Scanner;
/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Write a program that asks for your age in years, months, and days and writes 
 * out your age in seconds. Do this by calculating the number of total days 
 * you have been alive, then multiply this by the number of hours per day (24), 
 * the number of minutes per hour (60), and the number of seconds per minute (60). 
 * Assume that there are 365 days per year (ignore leap years). But correctly take 
 * account of the different number of days in different months. If the user 
 * enters 5 for the number of months, add up the number of days in the first 
 * 5 months: 31 + 28 + 31 + 30 + 31
 *
 * A human lifespan is about 2.5 billion seconds (2.5 billion heart-beats).
 * Here is a sample run:
 * 
 * Your age in years, months, and days. Enter three numbers>56 7 15
 * You are 1785628800 seconds old
 * 
 * Do the following:
 * 
 * 1. Write the getSeconds() method that takes in three parameters, the number of years,
 *    months and days. It calculates and returns the number of age in seconds using a
 *    sequence of if statements.
 * 2. Write the code in the main method to prompt the user for the their age in 
 *    years, months, and days and uses the above method to calculate and print the age
 *    in seconds.
 *     
 */
public class Activity3_2_2 {
	/**
	 * Calculates and returns the age in seconds from the age given in years, months, and days
	 * @param y - number of years 
	 * @param m - number of months
	 * @param d - number of days
	 * @return age in seconds
	 */
	public static int getSeconds(int y, int m, int d) {
        //Your code goes here
        return (y * 365 * 24 * 60 * 60) + (m * 30 * 24 * 60 * 60) + (d * 24 * 60 * 60);
	}
	/**
	 * Asks the user for their age in years, months, and days and calculates and prints
	 * their age in seconds. All three numbers are read in using a single scan statement
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
        //Declare variables
        Scanner scan = new Scanner(System.in);

        System.out.print("Your age in years, months, and days. Enter three numbers> ");
        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();

        System.out.println("You are " + getSeconds(y, m, d) + " seconds old");

        scan.close();

	}

}