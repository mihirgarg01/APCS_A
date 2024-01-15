package Unit6;

/**
 * 
 * @author Garg - Mihir - 12104703 - 4
 * 
 *         Write a Horse class that
 * 
 *         1. has two instance variables that hold the name of the horse and its
 *         weight
 *         2. has a constructor that initializes this horse's name and weight
 *         3. has an accessor method that returns the name of the horse
 *         4. has an accessor method that returns the weight of the horse
 *         5. has a toString method that returns the horse's name and weight as
 *         a string for printing
 *         as shown below:
 * 
 *         name: Silver weight: 1210
 *
 */
public class Horse {
    // private instance variables that represent the name and weight of this horse
    String name;
    int weight;

    /**
     * Constructor that initializes this horse
     * 
     * @param theName   - name of the horse
     * @param theWeight - weight of the horse
     */
    public Horse(String theName, int theWeight) {
        // Your code goes here
        this.name = theName;
        this.weight = theWeight;
    }

    /**
     * Return this horse's name
     * 
     * @return name of this horse
     */
    public String getName() {
        // Your code goes here
        return name;
    }

    /**
     * Return this horse's weight
     * 
     * @return weight of this horse
     */
    public int getWeight() {
        // Your code goes here
        return weight;
    }

    /**
     * Returns this object' name and weight as string
     * 
     * @return the name and weight of the object as a string for printing
     */
    public String toString() {
        // Your code goes here
        return ("space " + "has name" + name + " has name: " + weight);
    }
}