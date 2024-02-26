package Unit9.Creatures;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<SeaCreature> creatures = new ArrayList<SeaCreature>();
        creatures.add(new SeaCreature("Fred"));
        creatures.add(new Fish("Mike"));
        creatures.add(new Octopus("Ami"));
        creatures.add(new Dolphin("Jon"));

        for (SeaCreature s : creatures) {
            s.swim();
            s.breed();
            s.die();
        }
    }
}
