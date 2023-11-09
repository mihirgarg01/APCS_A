package Unit3;

import java.util.Scanner;

/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Write a program that asks a user for their birth year encoded as two digits
 * (like "62") and for the current year, also encoded as two digits (like "99").
 * The program is to correctly write out the users age in years.
 * 
 * Year of Birth: 62
 * Current year: 99
 * Your age: 37
 * 
 * The program will have to determine when a two digit value such as "62"
 * corresponds
 * to a year in the 20th century ("1962") or the 21st century. Here is another
 * run of the program,
 * where "00" is taken to mean the year 2000:
 * 
 * Year of Birth: 62
 * Current year: 00
 * Your age: 38
 * 
 * Assume that ages are not negative. Another run of the program:
 * 
 * Year of Birth: 27
 * Current year: 07
 * Your age: 80
 * 
 * In the following run, the age of the person could be 6 or 106 depending on
 * the
 * assumptions. Assume that the age will always be less than or equal to 100.
 * 
 * Year of Birth: 01
 * Current year: 07
 * Your age: 6
 * 
 * Do the following:
 * 
 * 1. Write the getAge() method that takes in two parameters, the birth year and
 * current year. It correctly determines when the two digit year corresponds
 * to a year in the 20th century or the 21st century and calculates
 * the age accordingly
 * 2. Write the code in the main method to prompt the user the current year and
 * birth
 * year and use the above method to calculate and print the age. Repeat these
 * steps
 * four times to calculate the age for four different sets of years.
 * 
 */
public class Activity3_3_1 {
    /**
     * Determines when the two digit year corresponds
     * to a year in the 20th century or the 21st century and calculates and returns
     * the age accordingly
     * 
     * @param birthYear   - year of birth
     * @param currentYear - current year
     * @return age
     */
    public static int getAge(int birthYear, int currentYear) {
        // Your code goes here
        int century = currentYear < birthYear ? 2000 : 1900;
        int birthYearFull = birthYear + century;
        int currentYearFull = currentYear + century;
        int age = currentYearFull - birthYearFull;
        if (age < 0) {
            age += 100;
        }
        return age;
    }

    /**
     * Prompts the user for two digit birth year and two digit current year and
     * determines
     * the age
     * 
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        // Your code goes here

            Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year of Birth ");
        int birthYear1 = scan.nextInt();
        System.out.print("Enter Current year ");
        int currentYear1 = scan.nextInt();
        int age1 = getAge(birthYear1, currentYear1);
        System.out.println("Your age is " + age1 + "\n");
        System.out.print("Enter Year of Birth ");
        int birthYear2 = scan.nextInt();
        System.out.print("Enter Current year ");
        int currentYear2 = scan.nextInt();
        int age2 = getAge(birthYear2, currentYear2);
        System.out.println("Your age is " + age2 + "\n");
        System.out.print("Enter Year of Birth ");
        int birthYear3 = scan.nextInt();
        System.out.print("Enter Current year ");
        int currentYear3 = scan.nextInt();
        int age3 = getAge(birthYear3, currentYear3);
        System.out.println("Your age is " + age3 + "\n");
        System.out.print("Enter Year of Birth ");
        int birthYear4 = scan.nextInt();
        System.out.print("Enter Current year ");
        int currentYear4 = scan.nextInt();
        int age4 = getAge(birthYear4, currentYear4);
        System.out.println("Your age is " + age4 + "\n");

        scan.close();
    }

}