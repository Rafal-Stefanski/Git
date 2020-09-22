package udemy.java_programming_masterclass.section12.challenge;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitPeriod) {
        super(name, orbitPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
