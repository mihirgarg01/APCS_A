package Unit4;

/**
 * Last name:
 * First name:
 * Student ID:
 * Period:
 * Write a static method named get4Heads that repeatedly flips a coin 
 * until four heads in a row are seen.  You should use Math.random() 
 * to give an equal chance to a head or a tail appearing. Each time 
 * the coin is flipped (1 is H and 2 is T), what is seen is 
 * displayed (H for heads, T for tails).  When four heads in a row are 
 * flipped a congratulatory message is printed.  Here are possible 
 * outputs of two calls to get4Heads:
 * 
 * T T T H T H H H H
 * Four heads in a row!
 *  
 *  T H T H T T T T T H H T H H H H 
 *  Four heads in a row! 
 *  
 *  Note that in order to test your results on Code Check, you 
 *  will need to use the Random object to generate random numbers.
 */
import java.util.Random;

public class Heads {
	static Random rand = new Random(1232);
	public static void get4Heads() {
        //Your code goes here
        int count = 0;

        while (count < 4) {
            int flip = rand.nextInt(2) + 1;
            if (flip == 1) {
                System.out.print("H ");
                count++;
            } else {
                System.out.print("T ");
                count = 0;
            }
        }

        System.out.println("\nFour heads in a row!");

        
	}
	public static void main(String[] args) {
		
		get4Heads();

	}

}