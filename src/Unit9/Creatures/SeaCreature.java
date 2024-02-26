package Unit9.Creatures;

public class SeaCreature {
    private String name;
    private String type;

    public SeaCreature(String name) {
        this.name = name;
        this.type = "Sea Creature";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void swim() {
        System.out.println("Woo Hoo " + getName() + " " + getType() + " is swimming!");
    }

    public void die() {
        System.out.println("Adios Amigos " + getName() + " " + getType() + " is dead!");
    }

    public String toString() {
        return getName() + " " + getType();
    }

    // Dummy meathod that does nothing (called by children of SeaCreatre)
    public void breed() {

    }
}
