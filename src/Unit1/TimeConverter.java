package Unit1;
import java.util.Scanner;

/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Write a program that finds the date based on a given Unix timestamp. The Unix
 * timestamp is a system for tracking the age of files using the number of
 * seconds that have occurred since the Unix epoch at 12:00:00 AM on January
 * 1st,1970. We will be assuming there are always 30 days per month (360 days a
 * year) to simplify the calculation.
 * 
 * For input, the program should accept an integer number of seconds to convert.
 * 
 * The program should then calculate the year, month, day, hour, minute, and
 * second based on the inputted timestamp. Format your outputs as shown in the
 * sample runs. Make sure that your spacing matches the sample runs exactly.
 * 
 * Months are represented by numbers ranging from 0 to 11. Days range from 0 to
 * 29. For example, 0 is January, 1 is February, etc. and 0 is the first day of
 * the month, 1 is the second day of the month, etc.
 * 
 * Sample Runs:
 * 
 * Seconds Since Unix Epoch: 999999999
 * 
 * Year: 2002 Month: 1 Day: 24 Hour: 1 Min: 46 Sec: 39
 * 
 * Seconds Since Unix Epoch: 178437
 * 
 * Year: 1970 Month: 0 Day: 2 Hour: 1 Min: 33 Sec: 57
 * 
 * As you work on this assignment, you can use the milestones below to inform
 * your development process:
 * 
 * Milestone 1: Create code which takes an integer input of seconds. Write an
 * expression which calculates the number of seconds in a year (based on the
 * assumptions in the question) and use this to calculate the number of full
 * years which have passed (remember to add this to 1970 for the complete year).
 * 
 * Milestone 2: Create code which finds the remaining number of seconds after
 * the whole amount of years found in the last milestone and stores these
 * values.
 * 
 * Milestone 3: Repeat steps in milestones 1 and 2 to find the number of months
 * in seconds remaining, and remaining seconds after the additional months are
 * accounted for.
 * 
 * Milestone 4: Repeat steps above for days, hours and minutes, then write code
 * to display the number of years, months, days, hours, minutes and seconds.
 */
public class TimeConverter {

        public static void main(String[] args) {
                // Declare Variables
                Scanner scan = new Scanner(System.in);
                int seconds = 0;
                int years = 0;
                int months = 0;
                int days = 0;
                int hours = 0;
                int minutes = 0;
                int secondsLeft = 0;

                System.out.print("Seconds since Unix Epoch: ");
                seconds = scan.nextInt();

                years = (seconds / (360 * 24 * 60 * 60)) + 1970;
                months = seconds % (360 * 24 * 60 * 60) / (30 * 24 * 60 * 60);
                days = seconds % (30 * 24 * 60 * 60) / (24 * 60 * 60);
                hours = seconds % (24 * 60 * 60) / (60 * 60);
                minutes = seconds % (60 * 60) / 60;
                secondsLeft = seconds % 60;
                // Ngl that was super hard to do. I got years and months right away but the rest
                // took a while.

                System.out.println();
                System.out.println();
                System.out.println();

                System.out.println("Year:  " + years);
                System.out.println("Month: " + months);
                System.out.println("Day:   " + days);
                System.out.println("Hour:  " + hours);
                System.out.println("Min:   " + minutes);
                System.out.println("Sec:   " + secondsLeft);

                scan.close();
        }

}