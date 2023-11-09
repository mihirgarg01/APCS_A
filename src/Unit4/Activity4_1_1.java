package Unit4;

public class Activity4_1_1 {
    /**
     * 
     * Given a positive integer n, return true if it contains the digit 5. You must use a 
     * while loop.
     *
     * Do the following:
     * 
     * 1. Write the method hasFive that takes in an integer parameter and returns true if
     * the given number contains a 5. You must do the following:
     *    - use a While loop
     *    - use only one return statement
     *    - the loop should stop after the first 5 is found
     *    - do not use any Break or Continue statements
     *    - do not use strings to solve the problem
     *    - include your name. id and period inside the method
     *  
     */

     /**
	 * Method returns true if n contains a 5 digit
	 * @param n - number to be examined
	 * @return true if n contains a 5, false otherwise
	 */
     public static boolean hasFive(int n) {
         //  Mihir Garg, 12104703
        while (n > 0) {
            if (n % 10 == 5) {
                return true;
            }
            n /= 10;
        }
        return false;
     }
    
     /**
	 * Client method to test the hasFive function
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
		
		int x = 50; 
		System.out.println("hasFive(" + x + ")->" + hasFive(x));

	}
}
