package Unit6;

/**
 * 
 * @author Garg - Mihir - 12104703 - 4
 * 
 *         Digital sounds can be represented as an array of integer values.
 *         For this activity, you will write methods of the Sound class.
 *
 *         1. Declare an instance variable that holds sound samples
 *         2. Write a constructor that takes in an array of sound samples and
 *         initializes the
 *         instance variable.
 *         3. The volume of a sound depends on the amplitude of each value in
 *         the sound. The
 *         amplitude of a value is its absolute value. For example, the
 *         amplitude of -2300 is
 *         2300 and the amplitude of 4000 is 4000. Write the method
 *         limitAmplitude that will
 *         change any value that has an amplitude greater than the given limit.
 *         Values that
 *         are greater than limit are replaced with limit, and values that are
 *         less than
 *         -limit are replaced with –limit. The method returns the total number
 *         of values
 *         that were changed in the array. For example, assume that the array
 *         samples has
 *         been initialized with the following values.
 *         [40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32,
 *         2030, 3223]
 *         When the statement int numChanges = limitAmplitude(2000); is
 *         executed, the value of
 *         numChanges will be 5, and the array samples will contain the
 *         following values.
 * 
 *         [40, 2000, 17, -2000, -17, -2000, 2000, 1048, -420, 33, 15, -32,
 *         2000, 2000]
 * 
 *         4. Write a method called numOfBeginningZeros that counts and returns
 *         the number of leading zeros
 *         in the samples array.
 *         5. Recorded sound often begins with silence. Silence in a sound is
 *         represented by a value of 0.
 *         Write the method trimSilenceFromBeginning that removes the silence
 *         from the beginning of a
 *         sound. To remove starting silence, a new array of values is created
 *         that contains the
 *         same values as the original samples array in the same order but
 *         without the leading zeros.
 *         The instance variable samples is updated to refer to the new array.
 *         For example, suppose
 *         the instance variable samples refers to the following array.
 * 
 *         Index 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
 *         Value 0 0 0 0 -14 0 -35 -39 0 -7 16 32 37 29 0 0
 * 
 *         After trimSilenceFromBeginning has been called, the instance variable
 *         samples will refer to
 *         the following array.
 *         Index 0 1 2 3 4 5 6 7 8 9 10 11
 *         Value -14 0 -35 -39 0 -7 16 32 37 29 0 0
 * 
 *         This method should use the numOfBeginningZeros method written above.
 *         6. Write an accessor method that returns the array of samples.
 */
public class Sound {
    /** the array of values in this sound; guaranteed not to be null */
    private int[] samples;

    /**
     * Constructor creates a samples array and initializes to given array
     * 
     * @param soundSamples - array containing sound samples
     */
    public Sound(int[] soundSamples) {
        // Your code goes here
        samples = soundSamples;
    }

    /**
     * Changes those values in this sound that have an amplitude
     * greater than limit
     * Values greater than limit are changed to limit.
     * 
     * @param limit the amplitude limit
     *              Precondition: limit >= 0
     * @return the number of values in this sound that this
     *         method changed
     */
    public int limitAmplitude(int limit) {
        // Your code goes here
        int count = 0;

        for (int i = 0; i < samples.length; i++) {
            if (samples[i] > limit) {
                samples[i] = limit;
                count++;
            } else if (samples[i] < -limit) {
                samples[i] = -limit;
                count++;
            }
        }

        return count;
    }

    /**
     * Counts the number of leading zeros in samples
     * 
     * @return number of leading zeros
     */
    public int numOfBeginningZeros() {
        // Your code goes here
        int count = 0;

        for (int sample : samples) {
            if (sample == 0) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    /**
     * Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0.
     * Precondition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal
     * of starting silence
     */
    public void trimSilenceFromBeginning() {
        // Your code goes here
        int zeros = numOfBeginningZeros();
        int[] trimmedSamples = new int[samples.length - zeros];

        System.arraycopy(samples, zeros, trimmedSamples, 0, trimmedSamples.length);
        samples = trimmedSamples;
    }

    /**
     * Returns the samples
     * 
     * @return samples array
     */
    public int[] getSamples() {
        // Your code goes here
        return samples;
    }
}