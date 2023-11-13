package Unit5;

import java.awt.Point;
// import java.awt.Point;

/**
 * Last Name: Garg
 * First Name: Mihir
 * Student ID: 12104793
 * Period: 4
 *
 * Write the Circle class. This class has the following private field
 * variables(data/state): int x, int y, double radius. Include at least two
 * constructors to initialize the variables.
 * 
 * It has the following instance methods: getArea(), boolean isInCircle(int a,
 * int b), translate(int dx, int dy), tripleTheRadius(), getCenter() and
 * getRadius().
 * 
 * Use the same driver class from the previous slide to test the Circle class.
 * Create multiple Circle objects using all of the constructors and call and
 * test all of the methods.
 * 
 *
 */
public class Circle {
    // Your instance variables go here
    private int x;
    private int y;
    private double radius;

    /**
     * Default constructor places a circle of radius 1 at the origin
     */
    public Circle() {
        // Your code goes here
        x = 0;
        y = 0;
        radius = 1;

    }

    /**
     * Constructor initializes the center and radius of the circle
     * 
     * @param x - x coordinate of center
     * @param y - y coordinate of center
     * @param r - radius
     */
    public Circle(int x, int y, double r) {
        // Your code goes here
        this.x = x;
        this.y = y;
        radius = r;
    }

    /**
     * Returns the area of the circle
     * 
     * @return area of circle
     */
    public double getArea() {
        // Your code goes here
        return Math.PI * radius * radius;
    }

    /**
     * Returns true if the given coordinates are inside the circle
     * 
     * @param x - x coordinate
     * @param y - y coorinate
     * @return true if (x,y) is inside the circle, false otherwise
     */
    public boolean isInCircle(int x, int y) {
        // Your code goes here
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
    }

    /**
     * Translates the center of the circle by given amount
     * 
     * @param dx - x translation
     * @param dy - y translation
     */
    public void translate(int dx, int dy) {
        // Your code goes here
        x += dx;
        y += dy;
    }

    /**
     * Triples the radius
     * 
     * public void tripleTheRadius() {
     * //Your code goes here
     * radius *= 3;
     * }
     * 
     * /**
     * Returns the center
     * 
     * @return circle center
     */
    public Point getCenter() {
        // Your code goes here
        return new Point(x, y);
    }

    /**
     * Returns the radius
     * 
     * @return radius
     */
    public double getRadius() {
        // Your code goes here
        return radius;
    }
}
