package Unit4;

import java.util.Scanner;


/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * Ask the user for two numbers. Print only the even numbers between them, you should also print the two numbers
 * if they are even. Note, there is no blank space at the end of the output.
 * Repeat this for two sets of data.
 *  
 * Sample Run:
 * 
 * Enter two numbers:
 * 3
 * 11
 * 4 6 8 10
 * Enter two numbers:
 * 10
 * 44
 * 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44
 *  
 */
public class Activity4_2_1 {
	/**
	 * Client method that prints the even numbers in a given range
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
        //Your code goes here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Enter two numbers:");

        num1 = input.nextInt();
        num2 = input.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println();
        input.close();
	}

}