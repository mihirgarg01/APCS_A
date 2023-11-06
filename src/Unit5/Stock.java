package Unit5;

/**
 * First name:  Mihir
 * Last name:  Garg
 * Student ID:  12104703
 * Period: 4
 * 
 * Encapsulate a Stock class that has
 * 
 * 1. three private fields
 *    - String symbol
 *    - int totalShares
 *    - double totalCost
 * 2. a constructor that takes in a symbol and initializes the stock's symbol to the 
 *    given symbol, and totalShares and totalCost to 0. Assume that the given symbol is
 *    not null or an empty string
 * 3. a getProfit method that takes in a current share price and returns the total profit
 *    earned if all the shares are sold that the given current price. Profit is the difference between
 *    the current price * number of shares - total cost. Note that this may be positive indicating
 *    profit or negative indicating loss
 * 4. a purchase method that takes in a number of shares and a price per share and updates the
 *    number of shares and the total cost of all the shares. Assume that the given number of shares and
 *    unit share price are not negative. The total cost is the product of number of shares and price per share.
 * 5. three accessor methods that return the values of each of the fields.
 * 
 */
public class Stock {
    //Add your private fields here
    private String symbol;
    private int totalShares;
    private double totalCost;

	/**
	 * Constructor initializes the symbol to the given symbol and the totalShares and totalCost to 0
	 * @param theSymbol - symbol of the stock
	 * Pre-condition: theSymbol is not null or an empty string
	 */
    //Add your constructor here
    public Stock(String theSymbol) {
        this.symbol = theSymbol;
        this.totalShares = 0;
        this.totalCost = 0.0;
    }    

	/**
	 * Method determines and returns the projected profit based on current price
	 * @param currentPrice - current price of one stock
	 * @return calculated profit based on totalCost of the stock and the current price of
	 *         the stock. If the profit is negative, it returns the loss (a negative value)
	 */
    //Add your getProfit method here
    public double getProfit(double currentPrice) {
        return Math.abs((currentPrice * this.totalShares) - this.totalCost);
    }

	/**
	 * Adds the given shares and their cost to the current stock
	 * @param shares - number of shares bought
	 * @param pricePerShare - price per share
	 * Pre-condition: shares and pricePerShare are not negative
	 */
    //Add your purchase method here
    public void purchase(int shares, double pricePerShare) {
        this.totalShares += shares;
        this.totalCost += (shares * pricePerShare);
    }

	/**
	 * Returns the stock symbol
	 * @return stock symbol
	 */
    //Add your accessor method here to return the symbol
    public String getSymbol() {
        return this.symbol;
    }

	/**
	 * Returns the total shares
	 * @return total shares
	 */
    //Add your accessor method here to return the number of shares
    public int getTotalShares() {
        return this.totalShares;
    }

	/**
	 * Returns the total cost
	 * @return total cost
	 */
    //Add your accessor method for the total cost here
    public double getTotalCost() {
        return this.totalCost;
    }
}