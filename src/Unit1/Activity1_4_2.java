package Unit1;
import java.util.Scanner;
/*
* Last name: Garg
* First name: Mihir
* Student ID: 12104703
* Period: 4
* 
* Unit 1 Lesson 4 Coding Activity 2
* 
* Write a program that asks the user for three names, 
* then prints the names in reverse order.
* Here is a sample run:
* Please enter three names: Zoey Zeb Zena
* Zena Zeb Zoey
*/
public class Activity1_4_2 {
	public static void main(String[] args) {
		// Add your code here
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter three names: ");
        String name0 = scan.next();
        String name1 = scan.next();
        String name2 = scan.next();

        System.out.println(name2 + " " + name1 + " " + name0);

        scan.close();
	}
}