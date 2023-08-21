package src;
import java.util.Scanner;
/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Unit 1 Lesson 5 Coding Activity 2
 * Write a program that reads in amount of rainfall in May, June, and July 
 * and computes the average rainfall. Declare and initialize 
 * - three variables to for the rainfall of each month. 
 * - a counter that is initialized to 0 and is incremented using the ++ operator
 *   each time a rainfall amount is scanned
 * - a variable to accumulate the rainfall amounts for the three months
 *   Use the += assignment operator and add the input rainfall amount each time
 *   a rainfall amount is scanned.
 * 
 * Here is sample run:
 * 
 * Rainfall for May: 12
 * Rainfall for June: 14
 * Rainfall for July: 8
 * Average rainfall: 11.333333333333334
 *
 */
public class Activity1_5_2 {
	public static void main(String[] args) {
        //Declare variables
        Scanner scanner = new Scanner(System.in);
        int mayRain = 0;
        int juneRain = 0;
        int julyRain = 0;

        System.out.print("Rainfall for May: ");
        mayRain = scanner.nextInt();

        System.out.print("Rainfall for June: ");
        juneRain = scanner.nextInt();

        System.out.print("Rainfall for July: ");
        julyRain = scanner.nextInt();

        System.out.println("Average rainfall: " + (double)(mayRain + juneRain + julyRain) / 3);

        scanner.close();
        
	}

}