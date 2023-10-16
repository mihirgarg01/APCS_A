package Unit4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * In the Pascal programming language, the assignment operator is the two character sequence := instead of a 
 * single = character as in Java. Write a program that reads in a source file line by line. Each sequence := 
 * in a line is changed into = before the line is output.
 * 
 * Here are two sample data files and their corresponding output
 * 
 * Input:
 * program noparmTest (input, output);
 * var a, b : integer;
 * 		  c : real;
 * function two: result integer;
 *   var n : integer;
 *   begin
 *     c := a + b;
 *     two := -c
 *   end
 * begin
 *   a := 1;
 *   b := 2;
 *   c := a+b+two;
 *   write(c)
 * end.
 *  
 * Output:
 * program noparmTest (input, output);
 * var a, b : integer;
 *        c : real;
 * function two: result integer;
 *   var n : integer;
 *   begin
 *     c = a + b;
 *     two = -c
 *   end
 * begin
 *   a = 1;
 *   b = 2;
 *   c = a+b+two;
 *   write(c)
 * end. 
 * 
 * Input:
 * program badPascal ( input, output );
 * var x, y, z : integer; {single colon is OK}
 * begin
 *   if x = y then      {will this mess up?}
 *     x := y+ z;      {should be no problem}
 *
 * {check that blank line}
 *
 * := x*y/12.3;  {what about := at the start?}
 *
 *   x := y;  y := z;  p := q  {multiple := in this line}
 * 
 * end.
 * 
 * Output:
 * program badPascal ( input, output );
 * var x, y, z : integer; {single colon is OK}
 * begin
 *   if x = y then      {will this mess up?}
 *     x = y+ z;      {should be no problem}
 *
 * {check that blank line}
 *
 * = x*y/12.3;  {what about = at the start?}
 * 
 *   x = y;  y = z;  p = q  {multiple = in this line}
 * 
 * end.
 *
 * Do the following:
 * 1. Write the translate method that takes in a single Pascal line and changes all occurrences of 
 *    ":=" to "=". You may only use indexOf and substring methods of the String class.
 * 2. The main method has been started for you. It uses a File object and a Scanner object 
 *    to read from a file. Do not worry about how file input is set up. 
 *    You can use the Scanner class methods irrespective of where the input is coming from 
 *    (file or keyboard). You will need to use a while loop with nextLine() and hasNextLine() 
 *    methods to read the data. You can read about hasNextLine() 
 *    at https://www.geeksforgeeks.org/scanner-hasnextline-method-in-java-with-examples/
 * 3. When you set up your project on Eclipse, make sure the two data files Test1.pas and 
 *    Test2.pas are added to the project folder (not the src folder). 
 */
public class Translator {
	/**
	 * Method takes in a Pascal statement and translates to a Java statement by
	 * replacing all the ":=" with "="
	 * @param pascal - a line of Pascal code
	 * @return translated line of Java code
	 */
	public String translate(String pascal) {
        //Your code goes here
        String result = "";

        for (int i = 0; i < pascal.length(); i++) {
            if (pascal.charAt(i) == ':' && pascal.charAt(i + 1) == '=') {
                result += '=';
                i++;
            } else {
                result += pascal.charAt(i);
            }
        }

        return result;
	}
	/**
	 * Reads in two Pascal programs from input files and goes line by line
	 * through the code and translates each line to Java by replacing all ":=" to "="
	 * @param args - command line arguments
	 * @throws FileNotFoundException - throws a File Not Found exception
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Translator myTranslator = new Translator();
		Scanner sc = new Scanner(new File("Test1.pas"));
        //Add code here to read from sc Scanner object
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(myTranslator.translate(line));
        }
		
		sc = new Scanner(new File("Test2.pas"));
        //Repeat the code from above to read from another file
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(myTranslator.translate(line));
        }
			
		}
		
	}