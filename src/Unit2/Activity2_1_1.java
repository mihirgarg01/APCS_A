package Unit2;
/**
 * Last name: Garg
 * First name: Mihir
 * Student ID: 12104703
 * Period: 4
 * 
 * Use the Cat class and write code in the main to 
 * 1. create a Cat object
 * 2. give your cat a name, call it Tom
 * 3. say something
 * 4. eat
 * 5. play
 * 
 * Here is what a sample run should look like
 * Meow, my name is Tom
 * Yummy, I love fish!
 * I love playing with yarn ...
 */

public class Activity2_1_1 {
	public static void main(String[] args) {
        //Create the cat object
        Cat tom = new Cat();

        // Give the cat a name
        tom.name = "Tom";

        //Say something
        tom.say();

        //Eat
        tom.eat();

        //Play
        tom.play();
	}
}