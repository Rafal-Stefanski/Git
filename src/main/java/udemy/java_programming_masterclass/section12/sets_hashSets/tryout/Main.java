package udemy.java_programming_masterclass.section12.sets_hashSets.tryout;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static final Map<String, Desk> office = new HashMap<>();
    private static final Set<Desk> desks = new HashSet<>();

    public static void main(String[] args) {
        Desk tempDesk = new Desk("My desk", "Motorized sit/stand.");
        office.put(tempDesk.getName(), tempDesk);
        desks.add(tempDesk);

        Desk tempStuff = new Desk("2 Monitors", "side by side");
        office.put(tempStuff.getName(), tempStuff);
        tempDesk.addStuff(tempStuff);

        tempDesk = new Desk("Dads desk", "Large standard desk.");
        office.put(tempDesk.getName(), tempDesk);
        desks.add(tempDesk);

        tempStuff = new Desk("Single monitor", "Widescreen");
        office.put(tempStuff.getName(), tempStuff);
        tempDesk.addStuff(tempStuff);


        // Print out what we have.
        System.out.println("Desks: ");
        for (Desk i : desks) {
            System.out.println("\t" + i.getName() + " - " + i.getFeature());
        }

        // Print out stuff at the desks.
        Set<Desk> stuff = new HashSet<>();
        for (Desk i : desks) {
            stuff.addAll(i.getStuffOnTheDesk());
        }

        System.out.println("\nAll stuff: ");
        for (Desk i : stuff) {
            System.out.println("\t" + i.getName() + " - " + i.getFeature());
        }

        // Print stuff for a single desk.
        Desk singleDesk = office.get("My desk");
        System.out.println("\nStuff on: " + singleDesk.getName());
        for (Desk someStuff : singleDesk.getStuffOnTheDesk()) {
            System.out.println("\t" + someStuff.getName());
        }

        // Print stuff for a single desk.
        singleDesk = office.get("Dads desk");
        System.out.println("\nStuff on: " + singleDesk.getName());
        for (Desk someStuff : singleDesk.getStuffOnTheDesk()) {
            System.out.println("\t" + someStuff.getName());
        }
    }
}
