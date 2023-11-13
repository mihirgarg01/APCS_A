package Unit5;

/**
 * 
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Objects of the Time class hold a time value for a European‐style 24 hour
 * clock. The value consists of hours, minutes and seconds. The range of the
 * value is 00:00:00 (midnight) to 23:59:59 (one second before midnight).
 * 
 * Do the following: 
 * 1. Write the accessor methods that will return the three instance variables.
 * 2. Write the method tick which increases the number of
 *    seconds by one. If the number of seconds is 60 it adds one to the number of
 *    minutes and resets seconds to 0. If the number of minutes is 59 it adds one
 *    to the number of hours and resets the number of minutes to 0. If the number
 *    of hours reaches 24 it should be reset to 0. 
 * 3. Write the method add(Time offset) which adds the seconds together and 
 *    makes sure the result is 59 or less (incrementing the minutes as needed), 
 *    adds the minutes together and makes sure the result is 59 or less 
 *    (increments the hours as needed), and adds the hours together (resetting 
 *    the hours to 0 if it reaches 24). Use the accessor methods to access the
 *    instance variables of the offset object.
 */
public class Time {
	// The values of the three parts of the time
	private int hours;
	private int minutes;
	private int seconds;

	/**
	 * Creates a new Time object set to 00:00:00 Do not change this constructor.
	 */
	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}

	/**
     * Constructor for objects of class Time. Creates a new Time object set to
     * h:m:s. Assumes, without checking, that the parameter values are within
     * bounds. For this task, you don't need to worry about invalid parameter
     * values. Do not change this constructor.
     * @param h - hours
     * @param m - mins
     * @param s = seconds
	 */
	public Time(int h, int m, int s) {
		this.hours = h;
		this.minutes = m;
		this.seconds = s;
	}
	/**
	 * Return the seconds
	 * 
	 * @return seconds of this Time object
	 */
	public int getSeconds() {
        //Your code goes here
        return seconds;
	}

	/**
	 * Returns the minutes
	 * 
	 * @return minutes of this Time object
	 */
	public int getMinutes() {
        //Your code goes here
        return minutes;
	}

	/**
	 * Returns the hours
	 * 
	 * @return hours of this Time object
	 */
	public int getHours() {
        //Your code goes here
        return hours;
	}
	/**
	 * Add one second to the current time. When the seconds value reaches 60, it
	 * rolls over to zero. When the seconds roll over to zero, the minutes advance.
	 * So 00:00:59 rolls over to 00:01:00. When the minutes reach 60, they roll over
	 * and the hours advance. So 00:59:59 rolls over to 01:00:00. When the hours
	 * reach 24, they roll over to zero. So 23:59:59 rolls over to 00:00:00.
	 */
	public void tick() {
        //Your code goes here
        seconds++;
	}

	/**
     * Add an offset to this Time. Rolls over the hours, minutes and seconds fields
     * when needed.
     * @param offset - the amount of time to add to this object
	 */
    public void add(Time offset) {
        //Your code goes here
        seconds += offset.seconds;
        minutes += offset.minutes;

        if (seconds >= 60) {
            minutes++;
            seconds = 0;
        }

        if (minutes >= 60) {
            hours++;
            minutes = 0;
        }
            
        if (hours >= 24) {
            hours = 0;
        }
              
        
	}

	

	/**
	 * Returns this Time object as a string for printing
	 * 
	 * @return this time object as a string
	 */
	public String toString() {
		return pad(hours) + ":" + pad(minutes) + ":" + pad(seconds);
	}

	/**
	 * Returns a string representing the argument value, adding a leading "0" if
	 * needed to make it at least two digits long. Do not change this.
	 */
	private String pad(int value) {
		String sign = "";
		if (value < 0) {
			sign = "‐";
			value = -value;
		}
		if (value < 10) {
			return sign + "0" + value;
		} else {
			return sign + value;
		}
	}
}