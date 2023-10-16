package Unit4;

/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * A certain drug looses 4% of its effectiveness every month it is in storage.
 * When its effectiveness
 * is below 50% it is considered expired and must be discarded. Write a program
 * that determines how many
 * months the drug can remain in storage.
 * 
 * Sample Run:
 * 
 * month: 0 effectiveness: 100.0
 * month: 1 effectiveness: 96.0
 * month: 2 effectiveness: 92.16
 * month: 3 effectiveness: 88.47359999999999
 * month: 4 effectiveness: 84.93465599999999
 * month: 5 effectiveness: 81.53726975999999
 * month: 6 effectiveness: 78.27577896959998
 * month: 7 effectiveness: 75.14474781081599
 * month: 8 effectiveness: 72.13895789838335
 * month: 9 effectiveness: 69.25339958244803
 * month: 10 effectiveness: 66.4832635991501
 * month: 11 effectiveness: 63.8239330551841
 * month: 12 effectiveness: 61.27097573297674
 * month: 13 effectiveness: 58.82013670365767
 * month: 14 effectiveness: 56.46733123551136
 * month: 15 effectiveness: 54.208637986090906
 * month: 16 effectiveness: 52.04029246664727
 * month: 17 effectiveness: 49.958680767981384 DISCARDED
 * 
 */
public class Activity4_1_3 {
    /**
     * Method calculates the effectiveness of a drug that loses 4% of its
     * effectiveness every month
     * 
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        // Your code goes here
        double effectiveness = 100;
        int month = 0;

        while (month <= 17) {
            System.out.print("month: " + month + "\teffectiveness: " + effectiveness);
            if (effectiveness < 50) {
                System.out.println(" DISCARDED");
            } else {
                System.out.println();
            }
            effectiveness *= 0.96;
            month++;
        }

    }

}