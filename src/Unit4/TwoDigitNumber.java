package Unit4;
import java.util.Random;

/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Write a static method named printTwoDigit that accepts an integer n as 
 * a parameter and that prints a series of n randomly generated numbers. 
 * The method should use Ranodom class to select numbers in the range of 
 * 10 to 19 inclusive where each number is equally likely to be chosen.  
 * 
 * After displaying each number that was produced, the method should indicate
 * whether the number 13 was ever selected ("we saw a 13!") or not 
 * ("no 13 was seen.").  You may assume that the value of n passed is at least 0. 
 * 
 * You should an output similar to below.
 * 
 * Call						Call output
 * --------------------------------------
 * printTwoDigit(4);		next = 12
 * 							next = 10
 * 							next = 16
 * 							next = 11
 * 							no 13 was seen.
 * printTwoDigit(7);		next = 12
 * 							next = 19
 * 							next = 12
 * 							next = 13
 * 							next = 11
 * 							next = 16
 * 							next = 13
 * 							we saw a 13!
 */
public class TwoDigitNumber {
	static Random rand = new Random(1200);
    /**
     * prints n two digit number in the range [10,19] and
     * prints a message to indicate 13 is generated or not
     * @param n - how many numbers to print
     */
	public static void printTwoDigit(int n) {
        //Your code goes here
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(10) + 10;
            System.out.println("next = " + num);
            if (num == 13) {
                System.out.println("we saw a 13!");
                return;
            }
        }

        System.out.println("no 13 was seen.");
                
	}
	public static void main(String[] args) {
		printTwoDigit(4);
		printTwoDigit(7);
        // printTwoDigit(7);
        
	}

}