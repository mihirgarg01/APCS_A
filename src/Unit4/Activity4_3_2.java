package Unit4;
import java.util.Scanner;

/**
 * Given a non-empty string and an int n, return the string made starting with char 0, 
 * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 *
 * Here is a sample output
 * 
 * Enter number of test cases: 3
 * Enter a string and an integer: Miracle 2
 *    everyNth(Miracle, 2) --> Mrce
 * Enter a string and an integer: abcdefg 2
 *    everyNth(abcdefg, 2) --> aceg
 * Enter a string and an integer: abcdefg 3
*     everyNth(abcdefg, 3) --> adg
 * 
 * Do the following:
 * 1. Write the everyNth method that does the task described above. Write your name within the method
 * 2. Fill in the main to prompt the user for number of test cases, read in each test case and print the 
 *    output as described above for each test case.
 * 
 */
public class Activity4_3_2 {

    // Mihir Garg | 12104703


	/**
	 * Returns a new string that consists of every nth character of str starting at char 0
	 * @param str - input string
	 * @param n - nth character to include
	 * @return - a new string that consists of every nth character of str starting at char 0
	 */
	public static String everyNth(String str, int n) {
        //Your code goes here
        String result = "";

        for (int i = 0; i < str.length(); i += n) {
            result += str.charAt(i);
        }

        return result;
	}
	/**
	 * Tests the everyNth method with different input
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		
        //Your code goes here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter a string and an integer: ");
            String str = input.next();
            int n = input.nextInt();
            System.out.println("   everyNth(" + str + ", " + n + ") --> " + everyNth(str, n));
        }

        input.close();

		
	}

}