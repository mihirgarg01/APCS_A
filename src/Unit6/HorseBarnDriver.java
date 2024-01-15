package Unit6;

public class HorseBarnDriver {

    public static void main(String[] args) {
        HorseBarn barn = new HorseBarn(7);
        Horse h = new Horse("Trigger", 1340);
        barn.add(0, h);
        h = new Horse("Silver", 1210);
        barn.add(2, h);
        h = new Horse("Lady", 1575);
        barn.add(3, h);
        h = new Horse("Patches", 1350);
        barn.add(5, h);
        h = new Horse("Duke", 1410);
        barn.add(6, h);

        // print out what is in the barn
        System.out.println("Before consolidate");
        System.out.println(barn);

        // test
        System.out.println("Index of Trigger should be 0 and is " +
                barn.findHorseSpace("Trigger"));
        System.out.println("Index of Silver should be 2 and is " +
                barn.findHorseSpace("Silver"));
        System.out.println("Index of Coco should be -1 and is " +
                barn.findHorseSpace("Coco"));
        // print out what is in the barn
        barn.consolidate();
        System.out.println("After consolidate");
        System.out.println(barn);

        // test
        System.out.println("Index of Trigger should be 0 and is " +
                barn.findHorseSpace("Trigger"));
        System.out.println("Index of Silver should be 1 and is " +
                barn.findHorseSpace("Silver"));
        System.out.println("Index of Coco should be -1 and is " +
                barn.findHorseSpace("Coco"));
    }
}