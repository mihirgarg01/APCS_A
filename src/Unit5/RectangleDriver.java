package Unit5;

/**
 * First name: Mihir
 * Last name:  Garg
 * Student ID: 12104703
 * Period: 4
 * 
 * Write a driver class that creates two Rectangle objects and prints them.
 * Here is what the output should look like. 
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
 *    This is a square!
 *      
 * You must use the toString method of the Rectangle class to print this information
 * without calling the toString method explicitly. Just do 
 * 
 * System.out.println(r)
 * 
 * where r is a Rectangle object.
 */
public class RectangleDriver {

	public static void main(String[] args) {
        //add code here
        Rectangle r1 = new Rectangle(10.0, 15.0);
        Rectangle r2 = new Rectangle(4.0);

        System.out.println(r1);
        System.out.println(r2);
	}

}