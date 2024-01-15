package Unit7;

/**
 * Last Name:
 * First Name:
 * Student ID:
 * Period:
 *
 * A mountain climbing club maintains a record of the climbs that its members
 * have made. Information about a
 * climb includes the name of the mountain peak and the amount of time it took
 * to reach the top. The information is
 * contained in the ClimbInfo class as declared below.
 */
class ClimbInfo {
    private String name;
    private int time;

    /**
     * Creates a ClimbInfo object with name peakName and time climbTime.
     * 
     * @param peakName  the name of the mountain peak
     * @param climbTime the number of minutes taken to complete the climb
     */
    public ClimbInfo(String peakName, int climbTime) {
        name = peakName;
        time = climbTime;
    }

    /**
     * Returns the name of the mountain peak
     * 
     * @return the name of the mountain peak
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the number of minutes taken to complete the climb
     * 
     * @return the number of minutes taken to complete the climb
     */
    public int getTime() {
        return time;
    }

    /**
     * Returns the climbing information as a string
     * 
     * @return information as a string
     */
    public String toString() {
        return "Peak name: " + name + " time: " + time;
    }
}