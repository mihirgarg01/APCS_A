package Unit7;

/**
 * 
 * An organization raises money by selling boxes of cookies. A cookie order
 * specifies the variety of cookie and the number of boxes ordered. The
 * declaration of the CookieOrder class is shown below.
 *
 */
public class CookieOrder {
    private int numBoxes;
    private String variety;

    /**
     * Constructs a new CookieOrder object
     * 
     * @param variety  - variety of cookie order
     * @param numBoxes - number of boxes ordered
     */
    public CookieOrder(String variety, int numBoxes) {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }

    /**
     * Returns the variety of cookie being ordered
     * 
     * @return the variety of cookie being ordered
     */
    public String getVariety() {
        return this.variety;
    }

    /**
     * Returns the number of boxes being ordered
     * 
     * @return the number of boxes being ordered
     */
    public int getNumBoxes() {
        return this.numBoxes;
    }
}
