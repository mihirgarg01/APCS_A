package Unit6;

/**
 * 
 * @author Garg - Mihir - 12104703 - 4
 * 
 *         Write a HorseBarn class that
 * 
 *         1. has N numbered spaces where each space can hold at most one horse.
 *         2. has a constructor that initializes the number of spaces to hold
 *         the horses
 *         3. has a method called add(int, Horse) that adds the given horse to
 *         the given space in the barn
 *         4. has a method called findHorseSpace(String) that finds the location
 *         of the given horse name in the
 *         barn.
 *         5. has a method called consolidate that consolidates the barn by
 *         moving horses so that the horses
 *         are in adjacent spaces, starting at index 0, with no empty spaces
 *         between any two horses. After
 *         the barn is consolidated, the horses are in the same order as they
 *         were before the consolidation.
 *         6. has a toString method that returns all the horses in the barn. The
 *         information will be printed as
 *         shown below
 * 
 *         space 0 has name: Trigger weight: 1340
 *         space 1 has name: Silver weight: 1210
 *         space 2 has name: Lady weight: 1575
 *         space 3 has name: Patches weight: 1350
 *
 *         This method should use the toString method of the Horse object.
 */
public class HorseBarn {
    // instance variable that represents numbered spaces to hold horses
    private Horse[] spaces;

    /**
     * Constructor that takes the number of stalls
     * 
     * @param numStalls - the number of stalls in the barn
     */
    public HorseBarn(int numStalls) {
        // Your code goes here
        spaces = new Horse[numStalls];
    }

    /**
     * Add the given horse to the given space
     * 
     * @param i - location to add to
     * @param h - horse to add
     */
    public void add(int i, Horse h) {
        // Your code goes here
        spaces[i] = h;

    }

    /**
     * Returns the index of the space that contains the horse with the specified
     * name.
     * Precondition: No two horses in the barn have the same name.
     * 
     * @param name the name of the horse to find
     * @return the index of the space containing the horse with the specified name;
     *         -1 if no horse with the specified name is in the barn.
     */
    public int findHorseSpace(String name) {
        // Your code goes here
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null && spaces[i].getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Consolidates the barn by moving horses so that the horses are in
     * adjacent spaces, starting at index 0, with no empty space between
     * any two horses.
     * Postcondition: The order of the horses is the same as before the
     * consolidation.
     */
    public void consolidate() {
        // Your code goes here
        Horse[] tempSpaces = new Horse[spaces.length];
        int j = 0;

        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null) {
                tempSpaces[j] = spaces[i];
                j++;
            }
        }

        spaces = tempSpaces;
    }

    /**
     * Returns the horses in all the spaces as a string for printing
     * 
     * @return all the horses in the spaces as a string
     */
    public String toString() {
        // Your code goes here
        String result = "";
        for (Horse horse : spaces) {
            if (horse != null) {
                result += horse.toString() + "\n";
            } else {
                result += "Empty space\n";
            }
        }
        return result;
    }
}