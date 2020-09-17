package udemy.java_programming_masterclass.section12.sets_hashSets.tryout;

// Tryout to make Set of desks in the office, with name, feature, and stuff on it.

import java.util.HashSet;
import java.util.Set;

public class Desk {
    private final String name;
    private final String feature;
    private final Set<Desk> stuffOnTheDesk;

    public Desk(String name, String feature) {
        this.name = name;
        this.feature = feature;
        this.stuffOnTheDesk = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public String getFeature() {
        return feature;
    }

    public boolean addStuff(Desk stuff){
        return this.stuffOnTheDesk.add(stuff);
    }

    public Set<Desk> getStuffOnTheDesk(){
        return new HashSet<>(this.stuffOnTheDesk);
    }
}
