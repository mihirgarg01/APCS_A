package Unit5;

/**
 * Last Name: Garg
 * First Name: Mihir
 * Student ID: 12104793
 * Period: 4
 * 
 * Rewrite the Point class with all of the methods in the lecture. Make sure it
 * has at least two constructors. Save it as Point.java. Then implement the
 * driver class the main method by creating some Point objects using
 * both constructors. Print out objects’ data by accessing its fields and by
 * calling its methods.
 */
public class Point {
	//Your instance variables goes here
    private int x, y;

	/**
	 * Default constructor
	 */
	public Point() {
        //Your code goes here
        x = 0;
        y = 0;
	}

	/**
	 * Sets the x and y coordinate to given coordinates
	 * 
	 * @param newX - new x coordinate
	 * @param newY - new y coordinate
	 */
	public Point(int newX, int newY) {
        //Your code goes here
        x = newX;
        y = newY;
	}

	/**
	 * Translates the x and y coordinates by given amounts
	 * 
	 * @param dx - x coordinate translation
	 * @param dy - y coordinate translation
	 */
	public void translate(int dx, int dy) {
        //Your code goes here
        x += dx;
        y += dy;
	}

	/**
	 * Returns the distance of this point from the origin
	 * 
	 * @return distance from origin
	 */
	public double distanceToOrigin() {
        //Your code goes here
        return Math.sqrt(x*x + y*y);
	}

	/**
	 * Returns the distance to given point
	 * 
	 * @param p - other point
	 * @return distance from p
	 */
	public double distanceToPoint(Point p) {
        //Your code goes here
        return Math.sqrt((x-p.getX())*(x-p.getX()) + (y-p.getY())*(y-p.getY()));
	}

	/**
	 * Returns x coordinate
	 * 
	 * @return x coordinate
	 */
	public int getX() {
        //Your code goes here
        return x;
	}

	/**
	 * Returns y coordinate
	 * 
	 * @return y coordinate
	 */
	public int getY() {
        //Your code goes here
        return y;
	}

}