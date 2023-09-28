package Unit2

// A Point object represents a pair of (x, y) coordinates.
// (Point class must be submitted with your solution; do not modify!)
public class Point {
	public int x;
	public int y;
	/**
	 * Default constructor initializes this point to the origin
	 */
	public Point() {
		setLocation(0,0);
	}
	/**
	 * Parameter constructor initializes this point to the given 
	 * x and y coordinates
	 * @param x - x coordinate
	 * @param y - y coordinate
	 */
	public Point(int x, int y) {
		setLocation(x, y);
	}
	/**
	 * Method calculates and returns the distance of this point
	 * from the origin
	 * @return distance from the origin
	 */
	public double distanceFromOrigin() {
		return distance(new Point());
	}
	/**
	 * Method calculates and returns the distance of this point
	 * from the given point
	 * @param p - given point
	 * @return distance between this point and given point p
	 */
	public double distance(Point p) {
		int dx = x - p.getX();
		int dy = y - p.getY();
		return Math.sqrt(dx * dx + dy * dy);
	}
	/**
	 * Returns the x coordinate
	 * @return x coordinate
	 */
	public final int getX() {
		return x;
	}
	/**
	 * Returns the y coordinate
	 * @return y coordinate
	 */
	public final int getY() {
		return y;
	}
	/**
	 * Sets the new location of this point
	 * @param xloc - new x coordinate
	 * @param yloc - new y coordinate
	 */
	public void setLocation(int xloc, int yloc) {
		x = xloc;
		y = yloc;
	}
	/**
	 * Sets the x coordinate to a new x value
	 * @param xloc new x coordinate
	 */
	public void setX(int xloc) {
		x = xloc;
	}
	/**
	 * Sets the y coordinate to a new y value
	 * @param yloc new y coordinate
	 */
	public void setY(int yloc) {
		y = yloc;
	}
	/**
	 * Returns the info about this point as a string
	 */
	public String toString() {
		return "(" + x + ", " + y +")";	
	}
	/**
	 * Moves this point by the given x and y translation
	 * @param dx - x translation
	 * @param dy - y translation
	 */
	public void translate(int dx, int dy) {
		setLocation(x + dx, y + dy);
	}
}