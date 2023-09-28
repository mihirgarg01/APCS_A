package Unit2;

/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * This activity involves using the Point class.
 * 1. Study the point class and identify the constructors
 * 2. Look at the methods provided in the Point class and see how 
 *    they are to be used
 * 3. Fill in the code in the main. Follow the comments and call the 
 *    Point methods to do what is indicated
 * 
 * Here is what a sample run should look like
 * p1 is (8, 2)
 * p2 is (4, 3)
 * p1's distance from origin is 8.246211251235321
 * p1 is now (9, 4)
 * p2 is now (3, 13)
 */

public class Activity2_2_1 {

	public static void main(String[] args) {
                // construct two Point objects, one at (8, 2) and one at (4, 3)
                Point p1 = new Point(8, 2);
                Point p2 = new Point(4, 3);
        
                // construct another Point object at the origin
                // Point p3 = new Point();
        
                // display the two Point objects' state
                System.out.println("p1 is " + p1.toString());
                System.out.println("p2 is " + p2.toString());


                // display p1 distance from origin
                System.out.println("p1's distance from origin is " + p1.distanceFromOrigin());

                // translate p1 to (9, 4)
                // translate p2 to (3, 13)
                p1.translate(1, 2);
                p2.translate(-1, 10);

                // display the two Point objects' state again
                System.out.println("p1 is now " + p1.toString());
                System.out.println("p2 is now " + p2.toString());
                
	}
}