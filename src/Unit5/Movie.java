package Unit5;

/**
 * First name: Mihir
 * Last name:  Garg
 * Student ID: 12104703
 * Period: 4
 * 
 * Write a Movie class that has the following:
 * 
 * 1. Three instance variables that represent the title of the movie, studio that made the movie, and 
 *    the rating of the movie (PG-13, R, etc).
 * 2. Write a constructor that takes a String representing the title of the the movie, a String representing 
 *    the rating of the movie, and a String representing the studio that made the movie. It sets the
 *    respective class variables to these values. 
 * 3. Write a second constructor that takes in a String representing the title of the movie and a String 
 *    representing the studio that made the movie. It sets the respective class variables to these values and
 *    sets the rating to "G"
 * 4. Write a boolean method isG that returns true of the movie is "G"
 * 5. Write a toString method that returns all the information about the movie as a string. In addition
 *    it also indicates whether the movie is suitable for all ages. Here is what a sample output would
 *    look like if a Movie objects were printed.
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
 * 6. Provide proper Javadoc style comments for each method.
 */
public class Movie {
    //add your private class variables or instance variables here
    private String title;
    private String studio;
    private String rating;

    //add your constructors here
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "G";
    }

	//add your isG method here
    public boolean isG() {
        return rating.equals("G");
    }

	//add your toString method here
    public String toString() {
        return "Movie name: " + title + "\nStudio: " + studio + "\nRating: " + rating + "\n  This movie is " + (isG() ? "" : "not ") + "suitable for all ages";
    }
	

}