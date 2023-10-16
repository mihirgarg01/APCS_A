package Unit4;
import java.util.Scanner;

public class Activity4_1_2 {
    /** 
     * Last name: Garg
     * First name: Mihir
     * Student ID: 12104703
     * Period: 4
     * 
     * Write a program that will input a list of test scores in from the keyboard. When the user enters -1, 
     * print the average. Do not use a Break or Continue statement.
     * Sample Run:
     * 
     * Enter the Scores:
     * 45
     * 100
     * -1
     * 
     * The average is: 72.5
     *  
     */
	
	/**
	 * Client method calculates the average of given numbers
	 * The numbers are read till a -1 is input
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		
        //Write code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Scores:");
        int sum = 0;
        int count = 0;
        int score = input.nextInt();
        while (score != -1) {
            sum += score;
            count++;
            score = input.nextInt();
        }
        System.out.println("The average is: " + (double) sum / count);
        input.close();
        
	}

}
