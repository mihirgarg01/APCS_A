package Unit7;

import java.util.ArrayList;

/**
 * Last Name: Garg
 * First Name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * The MasterOrder class maintains a list of the cookies to be purchased. The
 * declaration of the MasterOrder class is shown below.
 * 
 * Do the following:
 * 
 * 1. Create an instance variable that holds the list of cookie orders
 * 2. Write the constructor that creates an empty array list of cookie orders.
 * 3. Write the addOrder method that appends the given order to the list of
 * cookie orders.
 * 4. Write the getTotalBoxes method that computes and returns
 * the sum of the number of boxes of all cookie orders. If there are no cookie
 * orders in the master order, the method returns 0.
 * 5. Write the removeVariety method that updates the master order by removing
 * all of the cookie orders in which the variety of cookie matches the parameter
 * cookieVar.
 * The master order may contain zero or more cookie orders with the same variety
 * as cookieVar. The method returns the total number of boxes removed from the
 * master order.
 *
 */
public class MasterOrder {
    /** The list of all cookie orders */
    // Your code goes here
    private ArrayList<CookieOrder> orders;

    /**
     * Constructs a new MasterOrder object
     */
    public MasterOrder() {
        orders = new ArrayList<>();
    }

    /**
     * Adds theOrder to the master order.
     * 
     * @param theOrder the cookie order to add to the master order
     */
    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }

    /**
     * Returns the sum of the number of boxes of all of the cookie orders
     * 
     * @return the sum of the number of boxes of all of the cookie orders
     */
    public int getTotalBoxes() {
        int total = 0;
        for (CookieOrder order : orders) {
            total += order.getNumBoxes();
        }
        return total;
    }

    /**
     * Removes all cookie orders from the master order that have the same variety of
     * cookie as cookieVar and returns the total number of boxes that were removed.
     * 
     * @param cookieVar the variety of cookies to remove from the master order
     * @return the total number of boxes of cookieVar in the cookie orders removed
     */
    public int removeVariety(String cookieVar) {
        int boxesRemoved = 0;
        for (int i = orders.size() - 1; i >= 0; i--) {
            CookieOrder order = orders.get(i);
            if (order.getVariety().equals(cookieVar)) {
                boxesRemoved += order.getNumBoxes();
                orders.remove(i);
            }
        }
        return boxesRemoved;
    }
}