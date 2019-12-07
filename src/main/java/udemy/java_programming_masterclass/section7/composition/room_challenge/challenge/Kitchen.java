package udemy.java_programming_masterclass.section7.composition.room_challenge.challenge;

public class Kitchen {
    private String name;
    private WallWithDoors wallWithDoors;
    private Lamp lamp;

    public Kitchen(String name, WallWithDoors wallwithDoors, Lamp lamp) {
        this.name = name;
        this.wallWithDoors = wallwithDoors;
        this.lamp = lamp;
    }

    public String getName() {
        return name;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeSandwich() {
        System.out.println("Making Sandwich in progress");
    }
}
