package Test;
// Customer buys something that's $5.43
// Customer will pay $6.00
// Leftover $0.57 will be donated

import java.util.Scanner;

public class donation {
    public static void main(String[] args) {
        //Declare Variables
        Scanner scan = new Scanner(System.in);
        double amount = 0.0;
        double donation = 0.0;

        // Ask for input
        System.out.print("How much did you pay: $");
        amount = scan.nextDouble();

        // Run the calculations
        donation = 1 - (amount % 1);

        // Output
        System.out.println("You Paid: $" + (amount + donation));
        System.out.println("You donated: $" + donation);

        // Close the scanner
        scan.close();
    }
}
