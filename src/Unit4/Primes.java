package Unit4;

/*
    * Last Name: Garg
    * First Name: Mihir
    * Student ID: 12104703
    * Period: 4
    *
    * Do the following:
    * 1. Write a static method countFactors that accepts in 
    *    integer parameter returns the number of factors of the integer. 
    *    countFactors(24) returns 8 because 1, 2, 3, 4, 6, 8, 12, and 24 
    *    are factors of 24.
    * 2. Write a static method isPrime which returns whether or not an 
    *    integer is prime. This method must call countFactors.
    *    
    *    Example: isPrime(27) returns false and isPrime(47) returns true.
    * 3. Write a static method countPrimes that accepts in integer parameter 
    *    n returns the number of primes from 2 to n.
    *    
    *    countPrimes(24) returns 9 because 2, 3, 5, 7, 11, 13, 17, 19, 23 are primes 
    *    less than or equal to 24. 
*/
public class Primes {
	/**
	 * Accepts in integer parameter returns the number of
	 * factors of the integer. 
	 * @param n - number
	 * @return factors of n
	 */
	public static int countFactors(int n) {
        //Your code goes here
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        return count;
		
	}
	/**
	 * eturns whether or not an integer is prime. 
	 * @param n - number
	 * @return - true if it is a prime number, false otherwise
	 */
	public static boolean isPrime(int n) {
        //Your code goes here
        return countFactors(n) == 2;
	}
	/**
	 * Accepts in integer parameter n returns the number 
	 * of primes from 2 to n.
	 * @param n - number
	 * @return number of primes from 2 to n
	 */
	public static int countPrimes(int n) {
        //Your code goes here
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                count++;
        }
        return count;
	}
	public static void main(String[] args) {
		System.out.println(countFactors(24));
		System.out.println(isPrime(24));
		System.out.println(isPrime(31));
		System.out.println(countPrimes(24));
		System.out.println(countPrimes(100));
	}

}