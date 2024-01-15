package Unit7;

import java.util.*;

/**
 * Last Name: Garg
 * First Name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * This question involves the process of taking a list of words, called
 * wordList, and producing a formatted string of a specified length. The list
 * wordList contains at least two words, consisting of letters only. When the
 * formatted string is constructed, spaces are placed in the gaps between words
 * so that as many spaces as possible are evenly distributed to each gap. The
 * equal number of spaces inserted into each gap is referred to as the basic gap
 * width. Any leftover spaces are inserted one at a time into the gaps from left
 * to right until there are no more leftover spaces.
 * 
 * The following three examples illustrate these concepts. In each example, the
 * list of words is to be placed into a formatted string of length 20.
 * 
 * Example 1: wordList: ["AP", "COMP", "SCI", "ROCKS"]
 * 
 * Total number of letters in words: 14
 * Number of gaps between words: 3
 * Basic gap width: 2
 * Leftover spaces: 0
 * 
 * Formatted string:
 * 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1
 * 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9
 * A P C O M P S C I R O C K S
 * 
 * Example 2: wordList: ["GREEN", "EGGS", "AND", "HAM"]
 * 
 * Total number of letters in words: 15
 * Number of gaps between words: 3
 * Basic gap width: 1
 * Leftover spaces: 2
 * 
 * The leftover spaces are inserted one at a time between the words from
 * left to right until there are no more leftover spaces. In this example,
 * the first two gaps get an extra space.
 * Formatted string:
 * 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1
 * 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9
 * G R E E N E G G S A N D H A M
 * 
 * Example 3: wordList: ["BEACH", "BALL"]
 * 
 * Total number of letters in words: 9
 * Number of gaps between words: 1
 * Basic gap width: 11
 * Leftover spaces: 0
 * 
 * Formatted string:
 * 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1
 * 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9
 * B E A C H B A L L
 *
 * Do the following:
 * 
 * 1. Write the StringFormatter method totalLetters, which returns the total
 * number of letters in the words in its parameter wordList. For example, if the
 * variableList<String> words is [“A”, “frog”, “is”],then the call
 * StringFormatter.totalLetters(words)
 * returns 7. You may assume that all words in wordList consist of one or more
 * letters.
 * 2. Write the StringFormatter method gaps that returns the number of gaps
 * between the
 * words in its parameter wordList.
 * 3. Write the StringFormatter method basicGapWidth, which returns the basic
 * gap width as defined above.
 * 4. Write the StringFormatter method leftoverSpaces, which returns the number
 * of left over spaces as defined above.
 */
public class StringFormatter {
    /**
     * Returns the total number of letters in wordList.
     * 
     * @param wordList - list of words
     * @return total number of letters in wordList
     *         Precondition: wordList contains at least two words, consisting of
     *         letters only.
     */
    public int totalLetters(List<String> wordList) {
        int total = 0;
        for (String word : wordList) {
            total += word.length();
        }
        return total;
    }

    /**
     * Returns number of gaps between the words in the list
     * 
     * @param wordList - list of words
     * @return number of gaps between the words
     */
    public int gaps(List<String> wordList) {
        return wordList.size() - 1;
    }

    /**
     * Returns the basic gap width when wordList is used to produce
     * a formatted string of formattedLen characters.
     * 
     * @param wordList     - list of words
     * @param formattedLen - length of the formatted string
     * @return basic gap width in the formatted string
     *         Precondition: wordList contains at least two words, consisting of
     *         letters only.
     *         formattedLen is large enough for all the words and gaps.
     */
    public int basicGapWidth(List<String> wordList, int formattedLen) {
        int totalLetters = totalLetters(wordList);
        int gaps = gaps(wordList);
        return (formattedLen - totalLetters) / gaps;
    }

    /**
     * Returns the left over spaces when wordList is used to produce
     * a formatted string of formattedLen characters as described above.
     * 
     * @param wordList     - list of words
     * @param formattedLen - length of the formatted string
     * @return left over spaces after the basic gap width is applied to the word
     *         list
     *         Precondition: wordList contains at least two words, consisting of
     *         letters only.
     *         formattedLen is large enough for all the words and gaps.
     */
    public int leftOverSpaces(List<String> wordList, int formattedLen) {
        int totalLetters = totalLetters(wordList);
        int gaps = gaps(wordList);
        return formattedLen - totalLetters - basicGapWidth(wordList, formattedLen) * gaps;
    }

}
