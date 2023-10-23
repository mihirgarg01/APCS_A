package Unit4;
/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * A positive integer is called a “self-divisor” if every decimal digit of the
 * number is a divisor of the number, that is, the number is evenly divisible by
 * each and every one of its digits. For example, the number 128 is a self-
 * divisor because it is evenly divisible by 1, 2, and 8. However, 26 is not a
 * self-divisor because it is not evenly divisible by the digit 6. Note that 0
 * is not considered to be a divisor of any number, so any number containing a 0
 * digit is NOT a self-divisor. There are infinitely many self-divisors.
 * 
 * Write the isSelfDivisor method that takes in an integer and determines if 
 * the given number is a self divisor based on the given definition. You must
 * stop checking when the first non-divisor digit is obtained.
 */
public class SelfDivisor {

	/**
	 * Method determines if the given number is a self divisor
	 * 
	 * @param number the number to be tested Precondition: number > 0
	 * @return true if every decimal digit of number is a divisor of number; false
	 *         otherwise
	 */
	public static boolean isSelfDivisor(int number) {
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || number % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
	}

	/**
	 * Main method to test the isSelfDivisor method
	 * @param args - command line arguments
	 */

	public static void main(String[] args) {
		System.out.println("128: " + isSelfDivisor(128));
		System.out.println("26: " + isSelfDivisor(26));
		System.out.println("120: " + isSelfDivisor(120));
		System.out.println("102: " + isSelfDivisor(102));
	}

}