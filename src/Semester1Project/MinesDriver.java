package Semester1Project;

public class MinesDriver {
    public static void main(String[] args) {
        // String row5 = "|   |   |   |   |   |\n";

        // row5 = row5.substring(0, 2) + "💎" + row5.substring(2, row5.length() - 1);

        // row5 = row5.substring(0, 6) + "💎" + row5.substring(6, row5.length() - 1);

        // row5 = row5.substring(0, 18) + "💎" + row5.substring(18);

        // System.out.println(row5);


        String newRow = "|   |   |   |   |   |\n";
        String row0guess = "10,2";

        int counter = 0;

        for (int i = 0; i < newRow.length(); i++) {
            if (i == 2 || i == 6 || i == 10 || i == 14 || i == 18) {
                newRow = newRow.substring(0, i + counter) + "💎" + newRow.substring(i + 1 + counter);
                counter++;
            }
        }

        System.out.println(newRow);

    }
}
