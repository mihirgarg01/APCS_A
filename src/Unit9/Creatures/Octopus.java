// Set the super class to SeaCreature
package Unit9.Creatures;

public class Octopus extends SeaCreature {
    public Octopus(String name) {
        super(name);
        setType("Octopus");
    }

    public void breed() {
        int num = (int) (Math.random() * 200) + 1;
        System.out.println(toString() + " laid " + num + " egg(s)");
    }
}
