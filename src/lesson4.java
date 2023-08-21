import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        System.out.print("Enter your salary: ");
        double salary = in.nextDouble();

        System.out.println(name + "\'s age is " + age + " and salary is $" + salary);

        System.out.println("Enter your name, age, and salary: ");
        name = in.next();
        age = in.nextInt();
        salary = in.nextDouble();

        System.out.println(name + "\'s age is " + age + " and salary is $" + salary);

        in.close();
    }
}
