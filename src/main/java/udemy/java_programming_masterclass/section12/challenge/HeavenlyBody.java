package udemy.java_programming_masterclass.section12.challenge;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final  String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private BodyType bodyType;

//    added bodyType as Enum to the constructor.
    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;

//      because moons don't have satellites.
        if (bodyType == BodyType.MOON) {
            this.satellites = null;
        } else {
            this.satellites = new HashSet<>();
        }
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

//    @Override
//    public int hashCode() {
//        System.out.println("hashcode called");
//        return this.name.hashCode() + 57;
//    }


}
