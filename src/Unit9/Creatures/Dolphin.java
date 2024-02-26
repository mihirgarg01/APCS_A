// Set the super class to SeaCreature
package Unit9.Creatures;

public class Dolphin extends SeaCreature {
    public Dolphin(String name) {
        super(name);
        setType("Dolphin");
    }

    public void breed() {
        int num = (int) (Math.random() * 200) + 1;
        System.out.println(toString() + " laid " + num + " egg(s)");
    }
}
