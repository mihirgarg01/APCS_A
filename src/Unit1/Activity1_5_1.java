package Unit1;
import java.util.Scanner;
/**
 * Last name: Garg
 * First name: Mihir
 * Student ID:
 * Period:
 * 
 * Unit 1 Lesson 5 Coding Activity 1
 * Write a program that reads in a number of cents. The program will 
 * write out the number of dollars and cents, like this:
 * 
 * Input the cents: 324
 * That is  3 dollars and 24 cents.
 * (Use integer arithmetic and avoid floating point arithmetic. 
 * Review the integer remainder operator % if you are unsure how to proceed.)
 *
 */
public class Activity1_5_1 {
	public static void main(String[] args) {
		//Your code goes here
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input the cents: ");
		int cents = scanner.nextInt();
		int dollars = cents / 100;
		int leftoverCents = cents % 100;

		System.out.println("That is " + dollars + " dollars and " + leftoverCents + " cents.");

		scanner.close();
	}

}