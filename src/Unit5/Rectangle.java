package Unit5;

/**
 * First name: Mihir
 * Last name:  Garg
 * Student ID: 12104703
 * Period: 4
 * 
 * Write a Rectangle class that has the following:
 * 
 * 1. Two instance variables that represent the length and width of a rectangle.
 * 2. Write a constructor that takes a double value that represents the dimension of the rectangle. Set the
 *    length and width to this value. 
 * 3. Write a second constructor that takes in two double values that represent the length and width of the
 *    rectangle. Set the respective class variables to these values.
 * 4. Write a boolean method isSquare that returns true if the length and width are equal.
 * 5. Write a toString method that returns all the information about the rectangle as a string. In addition
 *    it also indicates whether the rectangle is a square. Here is what a sample output would
 *    look like if Rectangle objects were printed.
 *
 *    Length: 10.0
 *    Width: 15.0
 *    Area: 150.0
 *    Perimeter: 50.0
 *    
 *    Length: 4.0
 *    Width: 4.0
 *    Area: 16.0
 *    Perimeter: 16.0
 *      This is a square!
 *    
 * 6. Provide proper Javadoc style comments for each method.
 */
public class Rectangle {
    //add your private instance variables here
    private double length;
    private double width;
    
    //add your constructors here
    /**
     * Creates a square with the given dimension
     * @param dimension
     */
    public Rectangle(double dimension) {
        this.length = dimension;
        this.width = dimension;
    }

    /**
     * Creates a rectangle with the given length and width
     * @param length
     * @param width
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //add your area() method here
    /**
     * Calculates the area of the rectangle
     * @return
     */
	public double area() {
        return length * width;
    }
    
    //add your perimeter() method here
    /**
     * Calculates the perimeter of the rectangle
     * @return
     */
    public double perimeter() {
        return 2 * (length + width);
    }

    //add your isSquare method here
    /**
     * Checks if the rectangle is a square
     * @return
     */
    public boolean isSquare() {
        return length == width;
    }

    //add your toString method here
    /**
     * Returns a string representation of the rectangle
     */
    public String toString() {
        String outputString = "Length: " + length + "\nWidth: " + width + "\nArea: " + area() + "\nPerimeter: "
                + perimeter();
        if (isSquare()) {
            outputString += "\n  This is a square!";
        } else {
            outputString += "\n";
        }

        return outputString;
    }

}