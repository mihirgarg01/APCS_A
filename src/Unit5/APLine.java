package Unit5;

//Question A2 on 2010 AP Exam
/**
 * First name: Mihir
 * Last name: Garg
 * Student ID: 12104703
 * Period: 4
 * 
 * This problem is an AP Exam question.
 * 
 * An APLine is a line defined by the equation ax + by + c = 0 , where a is not
 * equal to zero, b is not equal to zero, and a, b, and c are all integers. The
 * slope of an APLine is defined to be the double value -a / b. A point
 * (represented by integers x and y) is on an APLine if the equation of the
 * APLine is satisfied when those x and y values are substituted into the
 * equation. That is, a point represented by x and y is on the line if ax + by +
 * c is equal to 0. Examples of two APLine equations are shown in the following
 * table.
 * 
 * Equation 			Slope (-a/b) 		Is point (5, -2) on the line? 
 * 5x + 4y - 17 = 0 	-5 / 4 = -1.25 		Yes, because 5(5) + 4(-2) + (-17) = 0 
 * -25x + 40y + 30 = 0 	25 / 40 = 0.625 	No, because -25(5) + 40(-2) + 30 != 0
 * 
 * Assume that the following code segment appears in a class other than APLine.
 * The code segment shows an example of using the APLine class to represent the
 * two equations shown in the table.
 * 
 * APLine line1 = new APLine(5, 4, -17); 
 * double slope1 = line1.getSlope(); // slope1 is assigned -1.25 
 * boolean onLine1 = line1.isOnLine(5, -2); // true because 5(5) + 4(-2) + (-17) = 0 
 * APLine line2 = new APLine(-25, 40, 30);
 * double slope2 = line2.getSlope(); // slope2 is assigned 0.625 
 * boolean onLine2 = line2.isOnLine(5, -2); // false because -25(5) + 40(-2) + 30 != 0
 * 
 * Write the APLine class. 
 * 
 * 1. Your implementation must include a constructor that has three integer parameters 
 *    that represent a, b, and c, in that order. You may assume that the values of the 
 *    parameters representing a and b are not zero. 
 * 2. It must also include a method getSlope that calculates and returns the
 *    slope of the line, and 
 * 3. a method isOnLine that returns true if the point represented by its two parameters 
 *    (x and y, in that order) is on the APLine and returns false otherwise. 
 *    Your class must produce the indicated results when invoked by the code segment 
 *    given above. You may ignore any issues related to integer overflow. Here is a sample 
 *    output for the above code.
 * 
 * 
 * Slope of line1: -1.25 
 * Point (5,-2) is on line: true 
 * Slope of line2: 0.625
 * Point (5,-2) is on line: false
 */
public class APLine {
	// declare instance variables that represent the coefficients a and b and the
	// constant
	// c in the equation of the line ax + by + c = 0
    //Your code goes here
    private int a;
    private int b;
    private int c;

	/**
	 * Constructor to initialize the coefficients a and b and the constant c in the
	 * equation of the line ax + by + c = 0
	 * 
	 * @param a - coefficient of x
	 * @param b - coefficient of y
	 * @param c - constant
	 */
    //Add your constructor here
    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

	/**
	 * Method to compute the slope of the line
	 * 
	 * @return slope of the line
	 */
    //Add the getSlope method here
    public double getSlope() {
        return -a / (double) b;
    }

	/**
	 * Method to check if the given point (x,y) falls on the line
	 * 
	 * @param x - x coordinate of the point
	 * @param y - y coordinate of the point
	 * @return true if the point falls on the line, false otherwise
	 */
    //Add the isOnline method here
    public boolean isOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }
}// end class