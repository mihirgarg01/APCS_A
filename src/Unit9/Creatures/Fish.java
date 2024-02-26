// Set the super class to SeaCreature
package Unit9.Creatures;

public class Fish extends SeaCreature{
    public Fish(String name) {
        super(name);
        setType("Fish");
    }

    public void breed() {
        int num = (int) (Math.random() * 200) + 1;
        System.out.println(toString() + " laid " + num + " egg(s)");
    }
}
