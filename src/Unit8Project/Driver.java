import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kay Den ham Sucks and cant code");

        Manipulator manipulate = new Manipulator();

        // input.nextLine();
        // manipulate.blackWhite("smokey.jpg");
        //

        // input.nextLine();
        // manipulate.greyscale("smokey.jpg");
        //
        // input.nextLine();
        // manipulate.luminanceGreyscale("smokey.jpg");

        input.nextLine();
        manipulate.rotateImage("smokey.jpg");
    }
}
