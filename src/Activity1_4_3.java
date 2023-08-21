import java.util.Scanner;

/*
* Last name: Garg
* First name: Mihir
* Student ID: 12104703
* Period: 4
* 
* Unit 1 Lesson 4 Coding Activity 2
* 
* Write a program that inputs a positive three digit integer. 
* and prints out the digits one per line.
* Sample run:
* Please enter a three digit number: 678
* Here are the digits:
* 6
* 7
* 8
*/
public class Activity1_4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a three digit number: ");
        int num = scan.nextInt();

        System.out.println("Here are the digits:");
        System.out.println(num / 100);
        System.out.println(num / 10 % 10);
        System.out.println(num % 10);
        
        scan.close();
    }
}