package Unit6;

public class GradesDriver {

    public static void main(String[] args) {
        Grades g = new Grades("./src/Unit6/scores.txt");
        g.printMaxMin();

    }

}