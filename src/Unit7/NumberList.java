package Unit7;

import java.util.ArrayList;

/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Write a short program to create an array list called to print the first 100
 * multiples of 3 starting with 0.
 * Do the following:
 * 
 * 1. Create the mulitplesOf3 method that creates and returns a list of first
 * 100 multiples of 3.
 * 2. Write the toString method that takes a list of values and returns the list
 * as a string so
 * that it can be printed in a tabular format with 10 numbers on each row.
 * 3. Write the removeEvens method that removes all the evens from the given
 * list.
 * 
 * Here is a sample output
 * 
 * 0 3 6 9 12 15 18 21 24 27
 * 30 33 36 39 42 45 48 51 54 57
 * 60 63 66 69 72 75 78 81 84 87
 * 90 93 96 99 102 105 108 111 114 117
 * 120 123 126 129 132 135 138 141 144 147
 * 150 153 156 159 162 165 168 171 174 177
 * 180 183 186 189 192 195 198 201 204 207
 * 210 213 216 219 222 225 228 231 234 237
 * 240 243 246 249 252 255 258 261 264 267
 * 270 273 276 279 282 285 288 291 294 297
 *
 */
public class NumberList {
    /**
     * Creates and returns a list consisting of first 100 multiples of 3.
     * 
     * @return list containing multiples of 3
     */
    public ArrayList<Integer> multiplesOf3() {
        ArrayList<Integer> multiples = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            multiples.add(i * 3);
        }
        return multiples;
    }

    /**
     * Converts the given list to a String. When the string is printed, it
     * prints a sequence of 10 numbers per line.
     * 
     * @param list - list of numbers to be converted
     * @return String containing the list of numbers to print 10 numbers per line
     */
    public String toString(ArrayList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if ((i + 1) % 10 == 0) {
                sb.append("\n");
            } else {
                sb.append("\t");
            }
        }
        return sb.toString();
    }

    /**
     * Removes all the evens from list
     * 
     * @param list - list of numbers
     */
    public void removeEvens(ArrayList<Integer> list) {
        list.removeIf(n -> n % 2 == 0);
    }
}
