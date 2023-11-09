package Unit4;

/**
 * Last name: 
 * First name: 
 * Student ID: 
 * Period:
 * 
 * This question involves reasoning about strings made up of uppercase letters.
 * You will implement two related methods that appear in the same class (not
 * shown). The first method takes a single string parameter and returns a
 * scrambled version of that string.
 * 
 * Write the method scrambleWord, which takes a given word and returns a string
 * that contains a scrambled version of the word according to the following
 * rules.
 * 
 * - The scrambling process begins at the first letter of the word and continues
 * from left to right.
 * 
 * - If two consecutive letters consist of an “A” followed by a letter that is
 * not an “A”, then the two letters are swapped in the resulting string.
 * 
 * - Once the letters in two adjacent positions have been swapped, neither of
 * those two positions can be involved in a future swap.
 * 
 * The following table shows several examples of words and their scrambled
 * versions.
 * 
 * word 			Result returned by scrambledWord(word)
 * ----------------------------------------------------- 
 * "TAN" 			"TNA"
 * "ABRACADABRA" 	"BARCADABARA" 
 * "WHOA" 			"WHOA" 
 * "AARDVARK" 		"ARADVRAK" 
 * "EGGS" 			"EGGS"
 * "A" 				"A" 
 * "" 				""
 */
public class StringScramble {

	/**
	 * Scrambles a given word.
	 * 
	 * @param word the word to be scrambled
	 * @return the scrambled word (possibly equal to word) Precondition: word is
	 *         either an empty string or contains only uppercase letters.
	 *         Postcondition: the string returned was created from word as follows:
	 *         - the word was scrambled, beginning at the first letter and
	 *         continuing from left to right - two consecutive letters consisting of
	 *         "A" followed by a letter that was not "A" were swapped - letters were
	 *         swapped at most once
	 */
    public static String scrambledWord(String word) {

        String scrambled = "";
        int i = 0;
        while (i < word.length()) {
            if (i < word.length() - 1 && word.charAt(i) == 'A' && word.charAt(i + 1) != 'A') {
                scrambled += word.charAt(i + 1);
                scrambled += word.charAt(i);
                i += 2;
            } else {
                scrambled += word.charAt(i);
                i++;
            }
        }
        return scrambled;
	}
	
	/**
	 * Main method to test the isSelfDivisor method
	 * 
	 * @param args - command line arguments
	 */

	public static void main(String[] args) {
		
		System.out.println("Testing scrambledWord");
		
		  String[] words = {"TAN", "ABRACADABRA", "WHOA",
	                        "AARDVARK", "EGGS", "A", ""};
	      for (String word : words)
	         System.out.println(word + " becomes " + scrambledWord(word));

	}

}