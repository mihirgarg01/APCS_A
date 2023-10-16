package Unit4;
// import java.util.Scanner;

/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Palindromes are strings that spell the same forwards and backwards. For
 * example, "madam" and
 * "Don't nod" are palindromes. Write a program that determines if a given
 * string is a palindrome or not.
 * Ignore any punctuations and spaces in the text.
 * 
 * Here is a sample run:
 * 
 * "Hello there!" and "!ereht olleH" are palindromes: false
 * "My gym" and "myg yM" are palindromes: true
 * "Was it a cat I saw?" and "?was I tac a ti saW" are palindromes: true
 * 
 * Do the following:
 * 1. Write the removePunctuation method that takes in a string and removes all
 * spaces
 * and punctuation. It returns a new string with all spaces and punctuations
 * removed.
 * Do not use any methods that have not been taught.
 * 2. Write the reverse method that takes in a string and returns its reverse
 * 3. Write the isPalindrome method that returns true if the given string is a
 * palindrome and false otherwise.
 * 4. Do not modify the main
 */
public class Activity4_3_1 {
    /**
     * Removes and returns a new string without any punctuation or spaces
     * 
     * @param inString - input string
     * @return inString without any spaces and punctuation
     */
    public static String removePunctuation(String inString) {
        // Your code goes here
        String result = "";
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < inString.length(); i++) {
            char c = inString.charAt(i);
            if (letters.indexOf(c) != -1) {
                result += c;
            }
        }

        return result;
    }

    /**
     * Returns the reverse of inString
     * 
     * @param inString - input string
     * @return reverse of inString
     */
    public static String reverse(String inString) {
        // Your code goes here
        String result = "";

        for (int i = inString.length() - 1; i >= 0; i--) {
            result += inString.charAt(i);
        }

        return result;
    }

    /**
     * Returns true if s is a palindrome
     * 
     * @param s - input string
     * @return true if s is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String s) {
        // Your code goes here
        return removePunctuation(s).equalsIgnoreCase(reverse(removePunctuation(s)));

    }

    /**
     * Client method determines if a string is a palindrome or not
     * 
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        String s = "Hello there!";
        System.out.println("\"" + s + "\" and \"" + reverse(s) + "\"" + " are palindromes: " + isPalindrome(s));
        s = "My gym";
        System.out.println("\"" + s + "\" and \"" + reverse(s) + "\"" + " are palindromes: " + isPalindrome(s));
        s = "Was it a cat I saw?";
        System.out.println("\"" + s + "\" and \"" + reverse(s) + "\"" + " are palindromes: " + isPalindrome(s));
        s = "Madam I'm Adam";
        System.out.println("\"" + s + "\" and \"" + reverse(s) + "\"" + " are palindromes: " + isPalindrome(s));
        s = "Don't nod";
        System.out.println("\"" + s + "\" and \"" + reverse(s) + "\"" + " are palindromes: " + isPalindrome(s));
        s = "No lemons, no melons";
        System.out.println("\"" + s + "\" and \"" + reverse(s) + "\"" + " are palindromes: " + isPalindrome(s));
    }

}