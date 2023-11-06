package Unit5;

import java.util.Random;

/**
 * First name: Mihir
 * Last name:  Garg
 * Student ID:  12104703
 * Period: 4
 * 
 * Write the drive class to test the Stock class
 * 
 * 1. Create a Stock object for Zoom that has a symbol ZM.
 * 2. Create a Random object with a seed of 1234
 * 3. Repeat 10 times
 *    - Generate a random price in the range of [1.0,500.0]
 *      - Generate a random number of shares in the range of [1, 1000]
 *      - Buy shares with the generated numbers
 *      - Print a message that includes the symbol, quantity purchased, purchase price, and total cost of all owned shares
 *      - Generate a random price for current price in the range of [1.0, 500.0]
 *      - Calculate the profit/loss if all the owned shares are sold
 *      - Print a message that includes the current price and the amount of profit or loss if all shares are sold
 *      
 *    Here is the output from first three runs of the program:
 *    
 *    Purchased 134 stocks of : ZM
 *      Purchase price: $324.29108014546284 per share
 *      Total cost of 134 shares owned: $43455.00473949202
 *      Selling at $119.72039629212367  will earn me a loss of 27412.471636347447
 *      
 *    Purchased 450 stocks of : ZM
 *      Purchase price: $159.5731242465474 per share
 *      Total cost of 584 shares owned: $115262.91065043834
 *      Selling at $168.97620127084696  will earn me a loss of 16580.80910826371
 *      
 *    Purchased 48 stocks of : ZM
 *      Purchase price: $102.9373909765658 per share
 *      Total cost of 632 shares owned: $120203.9054173135
 *      Selling 632 at $228.94033301855683  will earn me a profit of 24486.385050414436
 */
public class StockDriver {
	/**
	 * driver to test the Stock class
	 * @param args - command line arguments
	 */
	public static void main(String[] args) {
        //Add your code here
        Stock zoom = new Stock("ZM");
        
        Random rand = new Random(1234);

        for (int i = 0; i < 10; i++) {
            double price = rand.nextDouble() * 500.0;
            int shares = rand.nextInt(1000) + 1;

            zoom.purchase(shares, price);

            System.out.println("Purchased " + shares + " stocks of : " + zoom.getSymbol());
            System.out.println("Purchase price: $" + price + " per share");
            System.out.println("Total cost of " + zoom.getTotalShares() + " shares owned: $" + zoom.getTotalCost());
            System.out.println("Selling at $" + price + " will earn me a " + (zoom.getProfit(price) > 0 ? "profit" : "loss") + " of " + zoom.getProfit(price));
            System.out.println();
        }

	}

}