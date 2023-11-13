package Unit5;

/**
 * 
 * Last name:  Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * In this activity you will create a class called Fraction that will model a fraction. 
 * Milestone 1. A Fraction object has only two private instance variables or fields one 
 *    for the numerator and one for the denominator. The denominator is always positive. 
 * Milestone 2. The class has several overloaded constructors 
 *    a. Fraction() - Default constructor that initializes the fraction to 0 
 *    b. Fraction(int n) - Initializes the fraction to n. 
 *    c. Fraction(int n, int d) - Initializes the fraction to n/d. Assume that d will
 *       never be 0. The fraction is always in reduced form, this is done by calling
 *       the method reduce (described below). 
 *    d. Fraction(Fraction other) - Creates a copy of the given fraction, other. 
 * Milestone 3. The class has accessor and modifier methods
 *    a. getNumerator() - returns the numerator getDenominator() - returns the denominator 
 *    b. getValue() - returns the fraction as a double 
 *    c. setNumerator(int n) - modifies the numerator to n 
 *    d. setDenominator(int d) - modifies the denominator to d. Assume d is non-zero 
 *    e. setFraction(Fraction other) - copies the given fraction, other 
 * Milestone 4. The class has several arithmetic methods 
 *    a. add(Fraction other) - Returns the sum of this fraction and other. Resulting 
 *       fraction is in reduced form 
 *    b. add(int m) - Returns the sum of this fraction and m. Resulting 
 *       fraction is in reduced form 
 *    c. multiply(Fraction other) - Returns the product of this fraction and other. Resulting 
 *       fraction is in reduced form  
 *    d. multiply(int m) - Returns the product of this fraction and m. Resulting 
 *       fraction is in reduced form 
 * Milestone 5. The class has a helper method, gcf(int n, int d) to find the greatest common factor 
 *    of the the numerator and denominator. This will be used to reduce the fraction. For example,
 *    the fraction 2/6 can be reduced to 1/3. This is done by dividing the numerator
 *    and denominator by their greatest common factor, i.e., 2. The greatest common 
 *    factor can be found using the algorithm given by the flowchart in the problem statement.
 *    Use this algorithm to write the gcf method that takes in two numbers as parameters
 *    and finds and returns their greatest common factor. You may assume that the 
 *    both numbers passed to this method are positive.
 * Milestone 6. The class also has a helper method called reduce that reduces the numerator and denominator 
 *    by the greatest common factor (gcf) of the numerator and denominator. 
 *    a. Use the gcf method described above and reduce() the fraction to its simplest form. Since the 
 *       gcf method takes only positive arguments. You may use Math.abs() for this. So if you
 *       want to compute the gcf of n and d, you may call gcf(Math.abs(n), Math.abs(d)). 
 *    b. Ensure that the denominator is always positive, so if the fraction is a negative fraction, 
 *       that is indicated by a negative numerator and not a negative denominator.  
 * Milestone 7. In addition the class has a toString method to convert the fraction to a
 *    String. It returns a string of the form numerator/denominator. 
 */
public class Fraction {

	// ****************** Instance variables ******************

    //Your code goes here
    private int numerator;
    private int denominator;

	// ********************* Constructors *********************
	/**
	 * Default constructor, initializes the fraction to 0;
	 */

    //Your code goes here
    public Fraction() {
        this.numerator = 0;
        this.denominator = 0;
    }

	/**
	 * Constructor initializes the fraction to the given whole number
	 * 
	 * @param n - whole number
	 */
	
    //Your code goes here
    public Fraction(int n) {
        this.numerator = n;
        this.denominator = 0;
    }

	/**
	 * Constructor initializes the fraction to the given numerator and denominator.
	 * The fraction is stored in reduced form
	 * Pre-condition: d is non-zero
	 * Post-condtion: the fraction is in reduced form
	 *                d is positive
	 * 
	 * @param n - numerator
	 * @param d - denominator
	 */
	
    //Your code goes here
    public Fraction(int n, int d) {
        this.numerator = n;
        this.denominator = d;
    }

	/**
	 * Constructor copies the numerator and denominator of a given fraction
	 * 
	 * @param other - fraction to copy
	 */
	
    //Your code goes here
    public Fraction(Fraction other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

	// ******************** Accessor methods ********************
	/**
	 * Gets the numerator
	 * @return the numerator
	 */
	
    //Your code goes here
    public int getNumerator() {
        return this.numerator;
    }

	// ******************** Accessor methods ********************
	/**
	 * Gets the denominator
	 * @return the numerator
	 */
	
    //Your code goes here
    public int getDenominator() {
        return this.denominator;
    }

	// ******************** Accessor methods ********************
	/**
	 * Returns the value of this fraction as a double
	 * 
	 * @return fraction as a double
	 */
	
    //Your code goes here
    public double getValue() {
        return (double) this.numerator / this.denominator;
    }

	// ******************** Mutator methods ********************
	/**
	 * Sets the value of of the numerator
	 * 
	 * @param n - new numerator
	 */
	
    //Your code goes here
    public void setNumerator(int n) {
        this.numerator = n;
    }

	// ******************** Mutator methods ********************
	/**
	 * Sets the value of of the denominator
	 * 
	 * @param d - new denominator
	 * Pre-condition: d is non-zero
	 */
	
    //Your code goes here
    public void setDenominator(int d) {
        this.denominator = d;
    }

	// ******************** Mutator methods ********************
	/**
	 * Copies the numerator and denominator of a given fraction
	 * 
	 * @param other - fraction to copy
	 */
	
    //Your code goes here
    public void setFraction(Fraction other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

	// ******************** Other methods ********************

	/**
	 * Returns the sum of this fraction and another given fraction, other
	 * 
	 * @param other - fraction to add
	 * @return - the sum
	 * Post-condition - result is in reduced form
	 */

    //Your code goes here
    public Fraction add(Fraction other) {
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

	// ******************** Other methods ********************

	/**
	 * Returns the sum of this fraction and a given whole number m
	 * 
	 * @param m - number to add
	 * @return - the sum
	 * Post-condition - result is in reduced form
	 */

    //Your code goes here
    public Fraction add(int m) {
        int newNumerator = (this.numerator * 1) + (m * this.denominator);
        int newDenominator = this.denominator * 1;
        return new Fraction(newNumerator, newDenominator);
    }

	// ******************** Other methods ********************

	/**
	 * Returns the product of this fraction and another given fraction, other
	 * 
	 * @param other - fraction to multiply
	 * @return - the product
	 * Post-condition - result is in reduced form
	 */

    //Your code goes here
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

	// ******************** Other methods ********************

	/**
	 * Returns the product of this fraction and a given whole number m
	 * 
	 * @param m - number to multiply
	 * @return - the product
	 * Post-condition - result is in reduced form
	 */
	
    //Your code goes here
    public Fraction multiply(int m) {
        int newNumerator = this.numerator * m;
        int newDenominator = this.denominator * 1;
        return new Fraction(newNumerator, newDenominator);
    }

	// ******************** Other methods ********************

	/**
	 * Returns a string representation of this fraction
	 * 
	 * @return fraction as a String
	 */

    //Your code goes here
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

	// ******************** Helper methods ********************

	/**
	 * Method to find the greatest common divisor of the given numbers
	 * 
	 * @param a - first number
	 * @param b - second number
	 * @return - the greatest common divisor
	 */

    //Your code goes here
    public int gcf(int a, int b) {
        int gcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcf = i;
            }
        }
        return gcf;
    }

	// ******************** Helper methods ********************

	/**
     * Reduces this fraction by the gcf and makes denom > 0
     */
    //  Code goes here
    public void reduce() {
        int gcf = gcf(Math.abs(this.numerator), Math.abs(this.denominator));
        this.numerator /= gcf;
        this.denominator /= gcf;
    }

}
