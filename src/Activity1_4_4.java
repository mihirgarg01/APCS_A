import java.util.Scanner;

/*
* Last name: Garg
* First name: Mihir
* Student ID: 12104703
* Period: 4
* 
* Unit 1 Lesson 4 Coding Activity 2
* 
* Write a program that inputs a positive three digit integer
* and prints out sum of the digits. Use the format shown below.
* Sample run:
* Please enter a three digit number: 678
* Here are the digits:
* 6
* 7
* 8
* 
* 6 + 7 + 8 = 21
*/
public class Activity1_4_4 {
    public static void main(String[] args) {
        // Your code goes here
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a three digit number: ");
        int num = scan.nextInt();
        
        int num0 = (num / 100);
        int num1 = (num / 10 % 10);
        int num2 = (num % 10);

        System.out.println("Here are the digits:");
        System.out.println(num0 + "\n" + num1 + "\n" + num2);
        System.out.println("\n" + num0 + " + " + num1 + " + " + num2 + " = " + (num0 + num1 + num2));

        scan.close();
    }
}