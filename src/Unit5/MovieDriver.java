package Unit5;

/**
 * First name: Mihir
 * Last name: Garg
 * Student ID: 12104703
 * Period: 4
 * 
 * Write a driver class that creates two movie objects and prints them.
 * Here is what the output should look like. 
 *
 *    Movie name: Casino Royale
 *    Studio: Eon Productions
 *    Rating: PG-13
 *      This movie is not suitable for all ages
 *    
 *    Movie name: Toy Story
 *    Studio: Pixar
 *    Rating: G
 *      This movie is suitable for all ages
 *      
 * You must use the toString method of the Movie class to print this information
 * without calling the toString method explicitly. Just do 
 * 
 * System.out.println(m)
 * 
 * where m is a movie object.
 */
public class MovieDriver {

	public static void main(String[] args) {
        //Add your code here
        Movie m1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie m2 = new Movie("Toy Story", "Pixar");

        System.out.println(m1);
        System.out.println(m2);
	}

}