package Unit7;

import java.util.*;

/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * This question involves reasoning about strings made up of uppercase letters.
 * You will implement two related methods.
 * 
 * 1. The first method scrambleWord takes a single string parameter and returns
 * a
 * scrambled version of that string.
 * 
 * - The scrambling process begins at the first letter of the word and continues
 * from left to right.
 * - If two consecutive letters consist of an "A" followed by a letter that is
 * not an "A", then the two letters are swapped in the resulting string.
 * - Once the letters in two adjacent positions have been swapped, neither of
 * those
 * two positions can be involved in a future swap.
 * 
 * The following table shows several examples of words and their scrambled
 * versions.
 * 
 * word Result returned by scrambleWord(word)
 * ----------------------------------------------
 * "TAN" "TNA"
 * "ABRACADABRA" "BARCADABARA"
 * "WHOA" "WHOA"
 * "AARDVARK" "ARADVRAK"
 * "EGGS" "EGGS"
 * "A" "A"
 * "" ""
 * 
 * 2. The second method scrambleOrRemove takes a list of strings and modifies
 * the
 * list by scrambling each entry in the list. Any entry that cannot be scrambled
 * is removed from the list.
 *
 */
public class StringScramble {
    /**
     * Scrambles a given word.
     * 
     * @param word the word to be scrambled
     * @return the scrambled word (possibly equal to word)
     *         Precondition: word is either an empty string or contains only
     *         uppercase letters.
     *         Postcondition: the string returned was created from word as follows:
     *         - the word was scrambled, beginning at the first letter and
     *         continuing from left to right
     *         - two consecutive letters consisting of "A" followed by a letter that
     *         was not "A" were swapped
     *         - letters were swapped at most once
     */
    public String scrambleWord(String word) {
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 'A' && arr[i + 1] != 'A') {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i++; // Skip next index as it was involved in a swap
            }
        }
        return new String(arr);
    }

    /**
     * Modifies wordList by replacing each word with its scrambled
     * version, removing any words that are unchanged as a result of scrambling.
     * 
     * @param wordList the list of words
     *                 Precondition: wordList contains only non-null objects
     *                 Postcondition:
     *                 - all words unchanged by scrambling have been removed from
     *                 wordList
     *                 - each of the remaining words has been replaced by its
     *                 scrambled version
     *                 - the relative ordering of the entries in wordList is the
     *                 same as it was
     *                 before the method was called
     */
    public void scrambleOrRemove(List<String> wordList) {
        Iterator<String> iterator = wordList.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            String scrambled = scrambleWord(word);
            if (scrambled.equals(word)) {
                iterator.remove();
            } else {
                int index = wordList.indexOf(word);
                wordList.set(index, scrambled);
            }
        }
    }
}