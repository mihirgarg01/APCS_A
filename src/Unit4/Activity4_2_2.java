package Unit4;
import java.util.Scanner;

/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * Write a program that adds up integers that the user enters. First the programs asks how many 
 * numbers will be added up. Then the program prompts the user for each number. Finally it prints the sum.
 *  
 * Sample Run:
 * 
 * How many integers will be added: 5
 * Enter an integer: 3
 * Enter an integer: 4
 * Enter an integer: -4
 * Enter an integer: -3
 * Enter an integer: 7
 *
 * The sum is 7
 * The max value entered is 7
 * The min value entered is -4
 *  
 */
public class Activity4_2_2 {
	/**
	 * Client method prints the even numbers in the given range
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
        //Your code goes here
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many integers will be added: ");

        int num = input.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter an integer: ");
            int n = input.nextInt();
            sum += n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }

        System.out.println("\nThe sum is " + sum);
        System.out.println("The max value entered is " + max);
        System.out.println("The min value entered is " + min);

        input.close();
	}

}
