package Unit4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * A text message has been encoded by replacing each character of the message with an integer. 
 * Each integer is an index into a key-phrase that contains all the lower case letters of the alphabet 
 * as well as the space character. The key-phrase may contain the same character in several locations. 
 * The encoded text is series of integers, like this:
 * 
 * 35 10 10 33 9 24 3 17 41 8 3 20 51 16 38 44 47 32 33 10 19 38 35 28 49 
 * 
 * To decode the message, look up each integer in the key-phrase and output the corresponding character. 
 * For example, say that the key-phrase is this (the index of each character has been written above it):
 * 
 *           111111111122222222223333333333444444444455
 * 0123456789012345678901234567890123456789012345678901 
 * six perfect quality black jewels amazed the governor
 * 
 * using each integer from the encoded text as an index into the phrase results in the decoded message:
 * 
 * attack the bridge at dawn
 *
 * Write a program that decodes a secret message contained in a text file. The first line of the text file 
 * contains the key-phrase. Then the file contains a sequence of integers, each of which indexes the 
 * key-phrase. The last negative number indicates the end of the integers. Find the character corresponding 
 * to each integer and output the secret message. Note if a character character such as 'e' occurs several 
 * places in the key-phrase it may be encoded as different integers in different parts of the secret message.
 * 
 * (The recipient of the secret message gets only the file of integers and must put the key-phrase at 
 * the top of the file.) For example, here is the contents of a secret message file ready for the program:
 * 
 * six perfect quality black jewels amazed the governor
 * 35 10 10 33 9 24 3 17 41 8 3 20 51 16 38 44 47 32 33 10 19 38 35 28 49 -1
 * 
 * The main method has been started for you. The Scanner object is set up to be used with the nextLine() and
 * nextInt methods. You will read a phrase and then keep reading the integers till a negative number is read.
 * Repeat this with two text files secret1.txt and secret2.txt.
 * 
 */
public class Secrets {
	/**
	 * Method reads in a key-phrase and a sequence of integers from a file and decodes the secret message
	 * contained in the file
	 * @param args - command line arguments
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("secret1.txt");
        Scanner sc = new Scanner(inFile);
        String keyPhrase = sc.nextLine();
        String decodedMessage = "";

        int num = sc.nextInt();
        while (num >= 0) {
            decodedMessage += keyPhrase.charAt(num);
            num = sc.nextInt();
        }

        System.out.println(decodedMessage);

        sc.close(); // close the scanner object before reassigning it

        inFile = new File("secret2.txt");
        sc = new Scanner(inFile);
        keyPhrase = sc.nextLine();
        decodedMessage = "";

        num = sc.nextInt();
        while (num >= 0) {
            decodedMessage += keyPhrase.charAt(num);
            num = sc.nextInt();
        }

        System.out.println(decodedMessage);

        sc.close();
		
	}

}