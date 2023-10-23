package Unit4;

import java.util.Scanner;

public class Activity4_4_2 {
    /**
     * Prompts the user for a number and then prints all the prime factors of the
     * given number
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number:   ");
            int num = scan.nextInt();

            if (num <= 0)
                break;

            System.out.print(num + " = ");

            for (int i = 2; i <= num; i++) {
                while (num % i == 0) {
                    System.out.print(i);
                    num /= i;
                    if (num != 1) {
                        System.out.print(" x ");
                    }
                }
            }

            System.out.println();
        }

        scan.close();

    }
}