package Unit6;

/**
 * 
 * @author Garg - Mihir - 12104703 - 4
 * 
 *         A positive integer is called a “self-divisor” if every decimal digit
 *         of the number is a divisor of the number, that is, the number is
 *         evenly divisible by each and every one of its digits. For example,
 *         the number 128 is a self-divisor because it is evenly divisible by 1,
 *         2, and 8. However, 26 is not a self-divisor because it is not evenly
 *         divisible by the digit 6. Note that 0 is not considered to be a
 *         divisor of any number, so any number containing a 0 digit is NOT a
 *         self-divisor. There are infinitely many self-divisors.
 * 
 *         Do the following:
 * 
 *         1. Write the method isSelfDivisor, which takes a positive integer as
 *         its parameter
 *         and returns true if the number is a self divisor; otherwise it
 *         returns false.
 *         2. Write the method firstNumSelfDivisors, which takes two positive
 *         integers as parameters,
 *         representing a start value and a number of values. It returns an
 *         array of size num that contains
 *         the first num self-divisors that are greater than or equal to start.
 *         For example, the call
 *         firstNumSelfDivisors(10, 3) should return an array containing the
 *         values 11, 12, and 15, because
 *         the first three self-divisors that are greater than or equal to 10
 *         are 11, 12, and 15.
 */
public class SelfDivisor {
    /**
     * @param number the number to be tested
     *               Precondition: number > 0
     * @return true if every decimal digit of number is a divisor of number; false
     *         otherwise
     */
    public static boolean isSelfDivisor(int number) {
        // Your code goes here
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
     * @param start starting point for values to be checked
     *              Precondition: start > 0
     * @param num   the size of the array to be returned
     *              Precondition: num > 0
     * @return an array containing the first num integers >= start that are
     *         self-divisors
     */
    public int[] firstNumSelfDivisors(int start, int num) {
        // Your code goes here
        int[] result = new int[num];
        int count = 0;
        int current = start;

        while (count < num) {
            if (isSelfDivisor(current)) {
                result[count] = current;
                count++;
            }
            current++;
        }

        return result;
    }
}