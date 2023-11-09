package Unit2;

import java.util.Scanner;

 /**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * When you rent a car from an agency, the key ring has several pieces 
 * of info: license plate, make and year of car, and usually 
 * a special code. This code could be used to process data 
 * within the company's computers. This lab will practice determining 
 * that special car rental code from the license plate. 
 * 
 * Milestone1: Declare four String instance variables that hold the
 * info about the make, model, license plate, and code of the
 * rental car. Write a constructor that takes in the make, model, and
 * license plate of the car and initializes the instance variables. You
 * may assume that the license plate number consists of three letters
 * followed by a space and then followed by the 3 digit number. Here is an  
 * example: CPR 607. 
 * 
 * Milestone2: Write the String computeNumericCode() method that calculates the 
 * code of the car using the following rules:
 * 1. Add up the ASCII values of the 3 letters of the license plate number.
 * You may refer to the ASCII table given here: 
 * https://www.w3resource.com/java-exercises/basic/java-basic-exercise-41.php
 * If the license plate number is CPR, add up 67 + 80 + 82 to get 229.
 * 2. Add the sum of the letters to the single integer value of the rest
 * of the license place. In the above example, add the 229 to 607 to get 836.
 * Note that the entire license plate number including the digits are characters.
 * So to calculate the numeric value 607, you will need to convert the characters
 * to digits and them compute the numeric value. You cannot use ParseInt.
 * Return the sum
 * 
 * Milestone 3: Write the void computeCode() method to determine the rental car code. Call
 * the computeNumeric code method written above and save the result in a variable. Find the
 * integer remainder after dividing this value by 26. So, 836 % 26 = 4. Next determine the
 * alphabet corresponding to the remainder. In this case, get the 4th letter of the 
 * alphabet i.e., E (A being the 0th alphabet). Combine the letter with the
 * numeric code and set the instance variable that holds the rental code.
 * 
 * Milestone 4: Write a method called String getCode() that returns the rental code of the car. Call
 * the computeCode method written above. 
 * 
 * Milestone 5: Write the String toString() method that returns a String with all the info about
 * the car - its make, model, license plate, and rental code. This will be used in the main to
 * print the info about the car. Use the getCode method written above.
 * 
 * Look at the main method and see how the toString method is implicitly called
 * when the object is printed.
 * 
 * Here is a sample run:
 * 
 * Make: Nissan
 * Model: Sentra
 * License Plate: CPR 607
 * Make = Nissan
 * Model = Sentra
 * CPR 607 = E836
 *
 * Make: Chevrolet
 * Model: Suburban
 * License Plate: ECQ 782
 * Make = Chevrolet
 * Model = Suburban
 * ECQ 782 = L999
 *
 * Make: Buick
 * Model: Encore
 * License Plate: TWD 112
 * Make = Buick
 * Model = Encore
 * TWD 112 = N351
 */
 
public class CarRental {
	//Declare instance variables here
    String carMake = "";
    String carModel = "";
    String carLicencePlate = "";
    String carCode = "";

	/**
	 * Constructor to initialize the object
	 * @param make - make of the car
	 * @param model - model of the car
	 * @param licensePlate - licensePlate of the car
	 */
	public CarRental(String make, String model, String licensePlate)
	{
        //Your code goes here
        carMake = make;
        carModel = model;
        carLicencePlate = licensePlate;
		
	}
	/**
	 * Compute the numeric code using the digits of the license place
	 * @return the numeric code
	 */
    public int computeNumericCode() {
        //Your code goes here
        int one = (int) carLicencePlate.charAt(0);
        int two = (int) carLicencePlate.charAt(1);
        int three = (int) carLicencePlate.charAt(2);
        // int otherNumbres = carLicencePlate.substring(4, carLicencePlate.length());

        return one + two + three;
    }
	/**
	 * Method to calculate the car rental code
	 */
	public void computeCode()
    {
        //Your code goes here
        final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int code = computeNumericCode();
        int letterPosition = code % 4;
        String letter = letters.charAt(letterPosition) + "";

        // Save the output in the instance variable
        carCode = letter + code;
			
	}
	/**
	 * Method to return the car rental code
	 * @return - car rental code
	 */
	public String getCode()
    {
        computeCode();
        return carCode;
		//your code goes here
		
	}
	/**
	 * Method to return the string containing all the car info
	 * @return string containing car info
	 */
	public String toString()
	{
        //Your code goes here
        // System.out.println("Make: " + carMake);
        // System.out.println("Model: " + carModel);
        // System.out.println("Licence Plate: " + carLicencePlate);
        // System.out.println(carLicencePlate + " = " + getCode());

        return ("Make: " + carMake) + ("\nModel: " + carModel) + "\n" + (carLicencePlate + " = " + getCode());
	}
	/**
	 * Main program to test the CarRental class
	 * @param args - arguments
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
   		System.out.print("Make: ");
		String make = sc.nextLine();
		System.out.print("Model: ");
		String model = sc.nextLine();
		System.out.print("License Plate: ");
		String lic = sc.nextLine();
		
		CarRental c = new CarRental(make, model,lic);
		System.out.println(c);
		System.out.println();
		System.out.print("Make: ");
		make = sc.nextLine();
		System.out.print("Model: ");
		model = sc.nextLine();
		System.out.print("License Plate: ");
		lic = sc.nextLine();
		
		
		c = new CarRental(make, model,lic);
		System.out.println(c);
		System.out.println();

		System.out.print("Make: ");
		make = sc.nextLine();
		System.out.print("Model: ");
		model = sc.nextLine();
		System.out.print("License Plate: ");
		lic = sc.nextLine();
		
		c = new CarRental(make, model,lic);
		System.out.println(c);

		sc.close();
	}
	
}