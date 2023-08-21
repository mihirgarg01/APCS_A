import java.util.Scanner;
/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Write a program that will aggregate a set of movie ratings for a new film, 
 * entitled AP CSA: The Movie! Your program will compute an overall movie rating 
 * as a weighted average of ratings from a popular movie review website, ratings 
 * given by a private focus group, and movie critic ratings.
 * 
 * For input, the program should accept 3 ratings from a movie review website 
 * (as ints), 2 ratings from a focus group (as doubles), and 1 average rating 
 * from professional movie critics (as a double).
 * 
 * The program should then output the average website rating, the average focus 
 * group rating, the average movie critic rating, and the overall movie rating 
 * (as doubles).
 * 
 * The overall movie rating should be computed as a weighted average. Count the 
 * average website rating as 20% of the overall rating, the average focus group 
 * rating as 30% of the overall rating, and the average movie critic rating as 
 * 50% of the overall rating.
 * 
 * Sample Run:
 * 
 * Please enter ratings from the movie review website.
 * 75
 * 99
 * 10
 * 
 * Please enter ratings from the focus group.
 * 84.5
 * 92.3
 * 
 * Please enter the average movie critic rating.
 * 87.42
 * 
 * Average website rating: 61.333333333333336
 * Average focus group rating: 88.4
 * Average movie critic rating: 87.42
 * Overall movie rating: 82.49666666666667
 * 
 */

public class MovieRating {

	public static void main(String[] args) {
        //Declare Variables
        Scanner scan = new Scanner(System.in);
        int rating1 = 0;
        int rating2 = 0;
        int rating3 = 0;
        double focus1 = 0.0;
        double focus2 = 0.0;
        double averageRating = 0.0;

        double averageWebsiteRating = 0.0;
        double averageFocusRating = 0.0;
        double averageCriticRating = 0.0;
        double overallRating = 0.0;

        System.out.println("Please enter ratings from the movie review website.");
        rating1 = scan.nextInt();
        rating2 = scan.nextInt();
        rating3 = scan.nextInt();
        
        System.out.println("Please enter ratings from the focus group.");
        focus1 = scan.nextDouble();
        focus2 = scan.nextDouble();
        
        System.out.println("Please enter the average movie critic rating.");
        averageRating = scan.nextDouble();

        // Calculate the averages
        averageWebsiteRating = (double)(rating1 + rating2 + rating3) / 3;
        averageFocusRating = (double)(focus1 + focus2) / 2;
        averageCriticRating = averageRating;
        overallRating = (averageWebsiteRating * 0.2) + (averageFocusRating * 0.3) + (averageCriticRating * 0.5);

        System.out.println("Average website rating: " + averageWebsiteRating);
        System.out.println("Average focus group rating: " + averageFocusRating);
        System.out.println("Average movie critic rating: " + averageCriticRating);
        System.out.println("Overall movie rating: " + overallRating);
        

        scan.close();
	}


}